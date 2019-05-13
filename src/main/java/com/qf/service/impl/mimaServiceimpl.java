package com.qf.service.impl;

import com.qf.dao.mimaDao;
import com.qf.pojo.mima;
import com.qf.service.mimaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class mimaServiceimpl implements mimaService {
    @Autowired
    private mimaDao mimaDao;
    @Override
    public List<mima> mimalist() {
        return mimaDao.mimalist();
    }

    @Override
    public mima getmima(String name) {
        return mimaDao.getmima(name);
    }
}
