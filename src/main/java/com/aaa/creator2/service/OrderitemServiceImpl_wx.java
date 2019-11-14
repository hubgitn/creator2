package com.aaa.creator2.service;

import com.aaa.creator2.entity.Orderitem;
import com.aaa.creator2.entity.Orders;
import com.aaa.creator2.mapper.OrderitemMapper_wx;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class OrderitemServiceImpl_wx implements OrderitemService_wx{
    @Resource
    private OrderitemMapper_wx orderitemMapper_wx;
    @Override
    public int addOrderitem(Orderitem orderitem) {
        int result = orderitemMapper_wx.addOrderitem(orderitem);
        return result;
    }

    @Override
    public int addOrders(Orders orders) {
        int results = orderitemMapper_wx.addOrders(orders);
        return results;
    }
}
