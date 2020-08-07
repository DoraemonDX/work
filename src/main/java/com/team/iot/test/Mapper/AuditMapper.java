package com.team.iot.test.Mapper;

import com.team.iot.test.pojo.Audit;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AuditMapper {
    public Audit queryByNameAndCode();
    public Audit queryByName(String name);
    public int addAudit(Audit audit);
    public int updateAudit(Audit audit);
    public List<Audit> auditList();
}
