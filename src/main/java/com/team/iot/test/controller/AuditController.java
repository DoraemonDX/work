package com.team.iot.test.controller;

import com.google.gson.Gson;
import com.team.iot.test.Mapper.AuditMapper;
import com.team.iot.test.pojo.Audit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping(produces = "application/json;charset=UTF-8")
public class AuditController {

    @Autowired
    AuditMapper auditMapper;

    Gson gson = new Gson();

    @RequestMapping("/addaudit")
    public String addAudit(String name,String code,String id_card,byte[] id_card_img1,byte[] id_card_img2,byte[] qualification_card_img,String phone){
        Audit audit = new Audit(name, code,id_card,id_card_img1,id_card_img2,qualification_card_img,phone);
        int i = auditMapper.addAudit(audit);

        return gson.toJson(i);
    }
    @RequestMapping("/auditlist")
    public String auditList(){
        List<Audit> audits = auditMapper.auditList();
        return gson.toJson(audits);
    }
    @RequestMapping("/updateaudit")
    public String updateAudit(String name,String code,String id_card,byte[] id_card_img1,byte[] id_card_img2,byte[] qualification_card_img,String phone){
        Audit audit = new Audit(name, code,id_card,id_card_img1,id_card_img2,qualification_card_img,phone);
        int i = auditMapper.updateAudit(audit);
        return gson.toJson(i);

    }



}
