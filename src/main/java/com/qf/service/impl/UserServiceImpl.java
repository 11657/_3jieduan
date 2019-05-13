package com.qf.service.impl;


import com.qf.dao.UserDao;
import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    @Override
    public boolean getAdd(User ls) {
        return userDao.getAdd(ls)>0;
    }

    @Override
    public int delUser(int id) {
        return userDao.delUser(id);
    }

    @Override
    public boolean updateUser(User sh) {
        return userDao.updateUser(sh)>0;
    }

    @Override
    public int get(int id) {
        return userDao.get(id);
    }
}
