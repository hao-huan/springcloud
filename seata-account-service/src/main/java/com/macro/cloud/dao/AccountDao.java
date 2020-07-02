package com.macro.cloud.dao;

//import com.baomidou.mybatisplus.core.mapper.Mapper;

import java.math.BigDecimal;

import org.apache.ibatis.annotations.Param;

import org.springframework.stereotype.Repository;

import com.macro.cloud.domain.Account;

//import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

@Repository
//@Mapper
public interface AccountDao extends BaseMapper<Account>{

    /**
     * 扣减账户余额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
