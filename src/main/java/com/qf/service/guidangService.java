package com.qf.service;

import com.qf.pojo.guidang;

import java.util.List;

public interface guidangService {
    List<guidang>getAllguidang();
    boolean getAdd(guidang ls);
    boolean  updateguidang(guidang sh);
    int  get(int id);
}
