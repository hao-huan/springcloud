package com.macro.cloud.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.Duration;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;


@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport{


	@Bean
	public CacheManager cacheManager(RedisConnectionFactory redisConnectionFactory){
		RedisCacheConfiguration redisCacheConfiguration = RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofSeconds(300L));
		return RedisCacheManager.builder(RedisCacheWriter.nonLockingRedisCacheWriter(redisConnectionFactory)
).cacheDefaults(redisCacheConfiguration).build();
	}



	@Bean
	public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory connectionFactory){
	   RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<>();
	   redisTemplate.setConnectionFactory(connectionFactory);
	   Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);

	   ObjectMapper objectMapper = new ObjectMapper();
	   objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
	   objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);

	   jackson2JsonRedisSerializer.setObjectMapper(objectMapper);

	   redisTemplate.setValueSerializer(jackson2JsonRedisSerializer);
	   redisTemplate.setKeySerializer(new StringRedisSerializer());
	   redisTemplate.afterPropertiesSet();
	   return redisTemplate;
	}



}
