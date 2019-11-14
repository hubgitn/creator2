package com.aaa.creator2.service;

import com.aaa.creator2.entity.Orderitem;
import com.aaa.creator2.entity.Orders;

public interface OrderitemService_wx {

    public int addOrderitem(Orderitem orderitem);

   //添加到订单表
    public int addOrders(Orders orders);
}
