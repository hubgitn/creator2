package com.aaa.creator2.service;
import com.aaa.creator2.mapper.Orders1Mapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
@Service
@Transactional
public class Orders1ServiceImpl implements  Orders1Service{
    @Resource
    private Orders1Mapper orders1Mapper;
    @Override
    public int findOrders1() {
        return orders1Mapper.findOrders1();
    }
}
