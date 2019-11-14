package com.aaa.creator2.mapper;

import com.aaa.creator2.entity.Orderitem;
import com.aaa.creator2.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderitemMapper_wx {
      public int addOrderitem(Orderitem orderitem);
      //添加到订单表
      public int addOrders(Orders orders);
}
