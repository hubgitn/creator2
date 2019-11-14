package com.aaa.creator2.service;
import com.aaa.creator2.mapper.Orders2Mapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class Orders2ServiceImpl implements  Orders2Service{
    @Resource
    private Orders2Mapper orders2Mapper;
    @Override
    public int findOrders2() {
        return orders2Mapper.findOrders2();
    }
}
