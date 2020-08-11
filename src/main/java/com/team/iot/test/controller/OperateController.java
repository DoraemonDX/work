package com.team.iot.test.controller;


import com.google.gson.Gson;
import com.team.iot.test.Mapper.OperateMapper;
import com.team.iot.test.pojo.Operate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
@ResponseBody
@RequestMapping(produces = "application/json;charset=UTF-8")
public class OperateController {
    @Autowired
    private OperateMapper operateMapper;

    Gson gson = new Gson();

    @RequestMapping("/addOperate")
    public String addOperate(int id, String customer, String reservation_time, String run_time, String road, String driver, String team, String reality_plate, String applition_plate, String models, String appition_earn, String tax, String appition_pay, String time, String yuetongbao, String road_cost, String oil_cost, String play_cost, String niaosu_cost, String other_cost, String serial_number ,String state, String note){
        Operate operate = new Operate(id, customer, reservation_time, run_time, road, driver, team, reality_plate, applition_plate, models,appition_earn,tax,  appition_pay,  time,  yuetongbao, road_cost, oil_cost,play_cost,niaosu_cost,other_cost,serial_number,note,state,new Date());
        return gson.toJson(operateMapper.addOperate(operate));
    }

    @RequestMapping("/deleteOperate")
    public String deleteOperate(int id){
        return gson.toJson(operateMapper.deleteOperate(id));
    }

    @RequestMapping("/updateOperate")
    public String updateOperate(int id, String customer, String reservation_time, String run_time, String road, String driver, String team, String reality_plate, String applition_plate, String models, String appition_earn, String tax, String appition_pay, String time, String yuetongbao, String road_cost, String oil_cost, String play_cost, String niaosu_cost, String other_cost, String serial_number, String state, String note){
        Operate operate = new Operate(id, customer, reservation_time, run_time, road, driver, team, reality_plate, applition_plate, models,appition_earn,tax,  appition_pay,  time,  yuetongbao, road_cost, oil_cost,play_cost,niaosu_cost,other_cost,serial_number,note,state,new Date());
        return gson.toJson(operateMapper.updateOperate(operate));
    }

    @RequestMapping("/operateList")
    public String queryOperateList(){
        return gson.toJson(operateMapper.queryOperateList());
    }

    @RequestMapping("/queryOperateById")
    public String queryOperateById(int id){
        return gson.toJson(operateMapper.queryOperateById(id));
    }

    @RequestMapping("/queryOperateListById")
    public String queryOperateById(String state){
        return gson.toJson(operateMapper.queryOperateListById(state));
    }
}


