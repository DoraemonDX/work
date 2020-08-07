package com.team.iot.test.controller;

import com.team.iot.test.Mapper.OrderMapper;
import com.team.iot.test.pojo.order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class OrderController {

    @Autowired
    OrderMapper orderMapper;

    @RequestMapping("/addorder")
    public String addOrder(int id , String name, String code){
        order order = new order(id, name, code);
        int i = orderMapper.addOrder(order);
        return i+"";
    }

    @RequestMapping("/orderlist")
    public String orderList(){
        List<order> orders = orderMapper.queryOrderList();
        return orders.toString();
    }

    @RequestMapping("/queryorderbyid")
    public String queryOrderById(int id){
        order order = orderMapper.queryOrderById(id);
        return order.toString();
    }

    @RequestMapping("/deleteorder")
    public String deleteOrder(String name){
        int i = orderMapper.deleteOrder(name);
        return i+"";
    }
    @RequestMapping("/updateOrder")
    public String updateOrder(int id,String name,String code){
        order order = new order(id, name, code);
        int i = orderMapper.updateOrder(order);
        return i+"";
    }
}
