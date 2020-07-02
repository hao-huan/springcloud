package com.macro.cloud.service;

import com.baomidou.mybatisplus.extension.service.IService;

import java.math.BigDecimal;

import com.macro.cloud.domain.Account;

public interface AccountService extends IService<Account>{

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    void decrease(Long userId, BigDecimal money);


    /**
     *
     *
     * */
    Account selectByKey(Long id);
}
