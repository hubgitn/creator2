package com.aaa.creator2.service;

import com.aaa.creator2.mapper.Orders3Mapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class Orders3ServiceImpl implements  Orders3Service{
    @Resource
    private Orders3Mapper orders3Mapper;
    @Override
    public int findOrders3() {
        return orders3Mapper.findOrders3();
    }
}
