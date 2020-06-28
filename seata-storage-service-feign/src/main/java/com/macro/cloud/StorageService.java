package com.macro.cloud;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.macro.cloud.CommonResult;

/**
 * Hello world!
 *
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService  
{
    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease")
    CommonResult decrease(@RequestParam(value="productId") Long productId,@RequestParam(value="count")  Integer count) ;

}
