package com.aaa.creator2.service;
import com.aaa.creator2.entity.Order;

import java.util.List;

public interface OrderService {
    public List<Order> getOrderById(Integer uid);
}
