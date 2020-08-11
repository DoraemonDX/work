package com.team.iot.test.Mapper;


import com.team.iot.test.pojo.Loginuser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LoginuserMapper {
    public int addLoginuser(Loginuser loginuser);
    public int deleteLoginuser(Loginuser loginuser);
    public int updateLoginuser(Loginuser loginuser);
    public int validateLogon(Loginuser loginuser);
}
