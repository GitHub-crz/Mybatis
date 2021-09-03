package com.crz.dao;

import com.crz.poji.User;

import java.util.List;
import java.util.Map;

public interface UserMappr {
    List<User> getUserList();
    User getUserByid(int id);
    int addUser(User user);
    int updataUser(User user);
    int deleteUser(int id);
    int updatapwd(Map<String,Object> map);
    List<Map> getpartAttributes(String pwd);
}
