package com.aaa.creator2.mapper;

import com.aaa.creator2.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface OrderMapper {
    public List<Order> getOrderById(Integer uid);
}
