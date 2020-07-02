package com.macro.cloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.macro.cloud.dao.StorageDao;
import com.macro.cloud.domain.Storage;
import com.macro.cloud.service.StorageService;


@Service
public class StorageServiceImpl  extends ServiceImpl<StorageDao, Storage>  implements StorageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Autowired
    private StorageDao storageDao;

    /**
     * 扣减库存
     */
    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("------->storage-service中扣减库存开始");
	System.out.println("productId : " + productId + " , count : " + count);
        storageDao.decrease(productId,count);
        LOGGER.info("------->storage-service中扣减库存结束");
    }
}
