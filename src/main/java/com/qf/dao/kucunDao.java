package com.qf.dao;

import com.qf.pojo.kucun;

import java.util.List;

public interface kucunDao {
    List<kucun>getAllkucun();
    int getAdd(kucun ls);
    int    delkucun(int id);
    int  get(int id);
    int  updatekucun(kucun sh);
}
