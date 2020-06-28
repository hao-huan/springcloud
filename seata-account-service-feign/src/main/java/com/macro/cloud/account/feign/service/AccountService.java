package com.macro.cloud.account.feign.service;

import java.math.BigDecimal;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.macro.cloud.CommonResult;


@FeignClient(value="seata-account-service")
public interface AccountService {


    /**
     * 扣减账户余额
     */
     @RequestMapping("/account/decrease")
     CommonResult decrease(@RequestParam(value="userId") Long userId, @RequestParam(value="money") BigDecimal money);

}


//package com.macro.cloud.service;
//
//import com.macro.cloud.domain.CommonResult;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.math.BigDecimal;
//
//@FeignClient(value = "seata-account-service")
//public interface AccountService {
//
//    /**
//     * 扣减账户余额
//     */
//    @RequestMapping("/account/decrease")
//    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
//}
