package com.qf.dao;

import com.qf.pojo.jingli;

import java.util.List;

public interface jingliDao {
     List<jingli> getAlljingli();
     int  updatejingli(jingli sh);
     int  get(int id);
}
