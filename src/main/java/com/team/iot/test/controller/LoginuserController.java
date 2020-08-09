package com.team.iot.test.controller;


import com.google.gson.Gson;
import com.team.iot.test.Mapper.LoginuserMapper;
import com.team.iot.test.pojo.Loginuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping(produces = "application/json;charset=UTF-8")
public class LoginuserController {

    @Autowired
    private LoginuserMapper loginusermapper;

    Gson gson = new Gson();

    @RequestMapping("/addLoginuser")
    public String addLofinuser(String username ,String code){
        Loginuser loginuser = new Loginuser(username, code);
        return gson.toJson(loginusermapper.addLoginuser(loginuser));
    }

    @RequestMapping("/deleteLoginuser")
    public String deleteLofinuser(String username ,String code){
        Loginuser loginuser = new Loginuser(username, code);
        return gson.toJson(loginusermapper.deleteLoginuser(loginuser));
    }

    @RequestMapping("/updateLoginuser")
    public String updateLofinuser(String username ,String code){
        Loginuser loginuser = new Loginuser(username, code);
        return gson.toJson(loginusermapper.updateLoginuser(loginuser));
    }

    @RequestMapping("/validateLogon")
    public String validateLogon(String username ,String code){
        Loginuser loginuser = new Loginuser(username, code);
        return gson.toJson(loginusermapper.validateLogon(loginuser));
    }

}
