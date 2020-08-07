package com.team.iot.test.Mapper;

import com.team.iot.test.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> queryUserList();
    public User queryUserName(String name);
    public int update(User user);
    public int addUser(User user);
    public int deleteUser(String name);
}
