package com.qf.dao;



import com.qf.pojo.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUser();
    int getAdd(User ls);
    int    delUser(int id);
    int  updateUser(User sh);
    int  get(int id);
}