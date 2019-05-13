package com.qf.service.impl;

import com.qf.dao.nimDao;
import com.qf.pojo.nim;
import com.qf.service.nimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class nimServiceimpl  implements nimService {
    @Autowired
    private nimDao nimDao;
    @Override
    public nim getnim(String name) {
        return nimDao.getnim(name);
    }
}
