package com.qf.service;

import com.qf.pojo.Opp;

import java.util.List;

public interface OppService {
    List<Opp>getAllOpp();
    boolean  updateOpp(Opp sh);
    int  get(int id);
}
