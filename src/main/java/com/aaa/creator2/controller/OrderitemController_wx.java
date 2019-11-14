package com.aaa.creator2.controller;

import com.aaa.creator2.entity.Orderitem;
import com.aaa.creator2.entity.Orders;
import com.aaa.creator2.service.OrderitemService_wx;
import com.aaa.creator2.util.KeyUtil;
import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderitemController_wx extends KeyUtil {
    @Autowired
    private OrderitemService_wx orderitemService_wx;
    @ResponseBody
    @RequestMapping("addOrderitem")
    public Integer addOrderitem( String pid,String ordernum ,Integer uid,double osum) {
        System.out.println("===============" + pid);
        System.out.println("===============" + ordernum);

        System.out.println("===============" + uid);
        System.out.println("===============" + osum);

        String[] ids = pid.split(",");   //分割字符串
        String[] strCount = ordernum.split(",");   //分割字符串
        Orderitem order = new Orderitem();
        order.setOnumeration(KeyUtil.generateUniqueKey());
        for (int i = 0; i < ids.length; i++) {
            System.out.println(ids[i]);
            System.out.println(strCount[i]);

            order.setPid(Integer.parseInt(ids[i]));
            order.setOrdernum(Integer.parseInt(strCount[i]));
            orderitemService_wx.addOrderitem(order);
        }


        Orders orders = new Orders();
        orders.setOnumeration(KeyUtil.generateUniqueKey());
        orders.setUid(uid);
        orders.setOsum(osum);
        orderitemService_wx.addOrders(orders);
        return null;
    }

}
