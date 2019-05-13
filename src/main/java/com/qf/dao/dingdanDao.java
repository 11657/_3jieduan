package com.qf.dao;

import com.qf.pojo.dingdan;

import java.util.List;

public interface dingdanDao {
    List<dingdan>getAlldingdan();

    int  updatedingdan(dingdan sh);
    int  get(int id);
}
