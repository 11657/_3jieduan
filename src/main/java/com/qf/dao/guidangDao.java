package com.qf.dao;

import com.qf.pojo.guidang;

import java.util.List;

public interface guidangDao {
    List<guidang>getAllguidang();
    int  updateguidang(guidang sh);
    int getAdd(guidang ls);
    int  get(int id);
}
