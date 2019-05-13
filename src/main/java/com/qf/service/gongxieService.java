package com.qf.service;

import com.qf.pojo.gongxie;

import java.util.List;

public interface gongxieService {
    List<gongxie>getAllgongxie();
    boolean getAdd(gongxie ls);
    int  delgongxie(int id);
    boolean  updategongxie(gongxie sh);
    int  get(int id);
}
