package com.qf.service;

import com.qf.pojo.jingli;

import java.util.List;

public interface jingliService {
    List<jingli> getAlljingli();
    boolean  updatejingli(jingli sh);
    int  get(int id);
}
