package com.team.iot.test.controller;


import com.team.iot.test.Mapper.OperateMapper;
import com.team.iot.test.pojo.Operate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
@ResponseBody
public class OperateController {
    @Autowired
    private OperateMapper operateMapper;

    @RequestMapping("/addOperate")
    public String addOperate(int id, String customer, String reservation_time, String run_time, String road, String driver, String team, String reality_plate, String applition_plate, String models, String appition_earn, String tax, String appition_pay, String time, String yuetongbao, String road_cost, String oil_cost, String play_cost, String niaosu_cost, String other_cost, String serial_number, String note){
        Operate operate = new Operate(id, customer, reservation_time, run_time, road, driver, team, reality_plate, applition_plate, models,appition_earn,tax,  appition_pay,  time,  yuetongbao, road_cost, oil_cost,play_cost,niaosu_cost,other_cost,serial_number,note,new Date());
        return operateMapper.addOperate(operate)+"";
    }

    @RequestMapping("/deleteOperate")
    public String deleteOperate(int id){
        return operateMapper.deleteOperate(id)+"";
    }

    @RequestMapping("/updateOperate")
    public String updateOperate(int id, String customer, String reservation_time, String run_time, String road, String driver, String team, String reality_plate, String applition_plate, String models, String appition_earn, String tax, String appition_pay, String time, String yuetongbao, String road_cost, String oil_cost, String play_cost, String niaosu_cost, String other_cost, String serial_number, String note){
        Operate operate = new Operate(id, customer, reservation_time, run_time, road, driver, team, reality_plate, applition_plate, models,appition_earn,tax,  appition_pay,  time,  yuetongbao, road_cost, oil_cost,play_cost,niaosu_cost,other_cost,serial_number,note,new Date());
        return operateMapper.updateOperate(operate)+"";
    }

    @RequestMapping("/operateList")
    public List<Operate> queryOperateList(){
       return operateMapper.queryOperateList();
    }

    @RequestMapping("/queryOperateById")
    public Operate queryOperateById(int id){
        return operateMapper.queryOperateById(id);
    }
}

