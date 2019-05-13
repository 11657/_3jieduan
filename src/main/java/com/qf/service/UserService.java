package com.qf.service;

import com.qf.pojo.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();
    boolean getAdd(User ls);
    int  delUser(int id);
    boolean  updateUser(User sh);
    int  get(int id);
}
