package com.team.iot.test.Mapper;

import com.team.iot.test.pojo.Operate;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.*;

@Mapper
@Repository
public interface OperateMapper {
    public Operate queryOperateById(int id);
    public List<Operate> queryOperateList();
    public List<Operate> queryOperateListByState(String state);
    public int addOperate(Operate operate);
    public int deleteOperate(int id);
    public int updateOperate(Operate operate);
}
