package com.team.iot.test.Mapper;

import com.team.iot.test.pojo.order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface OrderMapper {
//    int id;
//    String name;
//    String code;
//    String id_card;
//    String sent;
//    String state;
    public order queryOrderById(int id);
    public List<order> queryOrderList();
    public int addOrder(order order);

    public int updateOrder(order order);
    public int deleteOrder(String name);

}
