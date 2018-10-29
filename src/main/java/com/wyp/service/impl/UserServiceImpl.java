package com.wyp.service.impl;

import com.wyp.dao.IUserDao;
import com.wyp.pojo.User;
import com.wyp.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userServiceImpl")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao iUserDao;

    @Override
    public int editUserById(User user) {
        return iUserDao.editUserById(user);
    }

    @Override
    public int addUser(User user) {
        return iUserDao.addUser(user);
    }

    @Override
    public User getUser(int id) {
        return iUserDao.getUser(id);
    }

    @Override
    public List<User> getAllUser() {
        return iUserDao.getAllUser();
    }
}
