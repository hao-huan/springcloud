package com.macro.cloud;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import com.macro.cloud.domain.Account;
import com.macro.cloud.service.AccountService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SeataAccountServiceApplicationTests {



	@Autowired 
	private AccountService accountService;

    @Test
    public void contextLoads() {
	    System.out.println("======");
	    System.out.println("accountService == null : " + (accountService == null));
	    long beginTime = System.currentTimeMillis();
	    Account account = accountService.selectByKey(1L);
	    long time = System.currentTimeMillis() - beginTime ;
	    System.out.println("Hello SpringBoot : " + account.getTotal() + ", 消耗查询时间 : " + time ); 
    }

}
