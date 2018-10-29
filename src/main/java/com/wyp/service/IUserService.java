package com.wyp.service;

import com.wyp.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IUserService {

    /*增加用户*/
    public int addUser(User user);

    /*查询用户*/
    public User getUser(int id);

    /*根据ID修改用户*/
    public int editUserById(User user);

    /*查询所有用户*/
    public List<User> getAllUser();
}
