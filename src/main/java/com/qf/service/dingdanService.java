package com.qf.service;

import com.qf.pojo.dingdan;

import java.util.List;

public interface dingdanService {
    List<dingdan>getAlldingdan();
   // List<dingdan>getAllByid(String id);
    boolean  updatedingdan(dingdan sh);
    int  get(int id);
}
