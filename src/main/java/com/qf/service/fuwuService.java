package com.qf.service;

import com.qf.pojo.fuwu;
import com.qf.pojo.kucun;

import java.util.List;

public interface fuwuService {
    List<fuwu> getAllfuwu();
    boolean getAdd(fuwu ls);
    int  delfuwu(int id);
    boolean  updatefuwu(fuwu sh);

    public fuwu selectfuwuByid (int id);
}


