package com.qf.dao;

import com.qf.pojo.fuwu;

import java.util.List;

public interface fuwuDao {
    List<fuwu>getAllfuwu();
    int getAdd(fuwu ls);
    int    delfuwu(int id);
    int  updatefuwu(fuwu sh);
    public fuwu selectfuwuByid (int id);
}
