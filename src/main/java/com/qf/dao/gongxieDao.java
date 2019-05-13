package com.qf.dao;

import com.qf.pojo.gongxie;

import java.util.List;

public interface gongxieDao {
    List<gongxie>getAllgongxie();
    int getAdd(gongxie ls);
    int    delgongxie(int id);
    int  updategongxie(gongxie sh);
    int  get(int id);
}
