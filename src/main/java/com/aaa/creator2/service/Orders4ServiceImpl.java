package com.aaa.creator2.service;

import com.aaa.creator2.mapper.Orders4Mapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class Orders4ServiceImpl implements  Orders4Service{
    @Resource
    private Orders4Mapper orders4Mapper;
    @Override
    public int findOrders4() {
        return orders4Mapper.findOrders4();
    }
}
