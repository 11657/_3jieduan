package com.qf.service;

import com.qf.pojo.liushi;

import java.util.List;

public interface liushiService {
    List<liushi> getAllliushi();

    boolean getAdd(liushi ls);
    boolean  updateliushi(liushi sh);

    int  delliushi(int id);

    int  get(int id);
}
