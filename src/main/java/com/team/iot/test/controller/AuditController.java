package com.team.iot.test.controller;

import com.team.iot.test.Mapper.AuditMapper;
import com.team.iot.test.pojo.Audit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class AuditController {

    @Autowired
    AuditMapper auditMapper;

    @RequestMapping("/addaudit")
    public String addAudit(String name,String code){
        Audit audit = new Audit(name, code);
        int i = auditMapper.addAudit(audit);
        return i + "";
    }
    @RequestMapping("/auditlist")
    public String auditList(){
        List<Audit> audits = auditMapper.auditList();
        return audits.toString();
    }
    @RequestMapping("/updateaudit")
    public String updateAudit(String name , String code){
        Audit audit = new Audit(name, code);
        int i = auditMapper.updateAudit(audit);
        return i+"";

    }



}
