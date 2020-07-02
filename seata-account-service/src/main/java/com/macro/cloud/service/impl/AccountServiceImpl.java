package com.macro.cloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.macro.cloud.dao.AccountDao;
import com.macro.cloud.domain.Account;
import com.macro.cloud.service.AccountService;

/**
 * 账户业务实现类
 * Created by macro on 2019/11/11.
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountDao, Account> implements AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);
    @Autowired
    private AccountDao accountDao;

    /**
     * 扣减账户余额
     */
    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("------->account-service中扣减账户余额开始");
        //模拟超时异常，全局事务回滚
//        try {
//            Thread.sleep(30*1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        accountDao.decrease(userId,money);
        LOGGER.info("------->account-service中扣减账户余额结束");
    }


    @Override 
    @Cacheable(value="account", key="'account'")
    public Account selectByKey(Long id){
      System.out.println("开始查询......");
      try{
      Thread.sleep(1*1000l);
      }catch(InterruptedException e){
        e.printStackTrace();
      }
      System.out.println("查询结束......");
     Account account =  accountDao.selectById(1L);  	 
      return account; 
    }

}
