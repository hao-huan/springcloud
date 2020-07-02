package com.macro.cloud.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.macro.cloud.domain.Storage;

/**
 *
 */
public interface StorageService extends IService<Storage>{
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
