package com.macro.cloud.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.apache.ibatis.annotations.Param;

import org.springframework.stereotype.Repository;

import com.macro.cloud.domain.Storage;

@Repository
public interface StorageDao extends BaseMapper<Storage>{

    /**
     * 扣减库存
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
