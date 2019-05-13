package com.qf.dao;

import com.qf.pojo.Opp;

import java.util.List;

public interface oppDao {
    List<Opp>getAllOpp();
    int  updateOpp(Opp sh);
    int  get(int id);
}
