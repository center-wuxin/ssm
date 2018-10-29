package com.wyp.dao;

import com.wyp.pojo.User;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

public interface IUserDao {

    /*增加用户*/
    //@Insert("insert into t_user values(null,${userName},${passWord},${age})")
    public int addUser(User user);

    /*查询用户*/
    public User getUser(int id);

    /*根据ID修改用户*/
    public int editUserById(User user);

    /*根据UD删除用户*/
    public int delUserById(int id);

    /*查询所有用户*/
    public List<User> getAllUser();

}
