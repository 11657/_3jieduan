package com.qf.service;

import com.qf.pojo.kucun;

import java.util.List;

public interface kucunService {
    List<kucun>getAllkucun();
    boolean getAdd(kucun ls);
    int  delkucun(int id);
    boolean  updatekucun(kucun sh);
    int  get(int id);
}
