package com.qf.dao;

import com.qf.pojo.liushi;

import java.util.List;

public interface liushiDao {

 List<liushi> getAllliushi();

 int getAdd(liushi ls);

 int  updateliushi(liushi sh);

  int    delliushi(int id);

   int  get(int id);


}
