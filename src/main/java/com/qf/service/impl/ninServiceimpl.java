package com.qf.service.impl;

import com.qf.dao.ninDao;
import com.qf.pojo.nin;
import com.qf.service.ninService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ninServiceimpl implements ninService {
    @Autowired
    private ninDao ninDao;
    @Override
    public nin getnin(String name) {
        return ninDao.getnin(name);
    }
}
