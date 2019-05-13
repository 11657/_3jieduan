package com.qf.service.impl;

import com.qf.dao.chuliDao;
import com.qf.pojo.chuli;
import com.qf.service.chuliService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class chuliServiceImpl implements chuliService {

    @Resource
    private chuliDao chuliDao;
    @Override
    public List<chuli> getAllchuli() {
        return chuliDao.getAllchuli();
    }

    @Override
    public List<chuli> getchuli(String name) {
        return chuliDao.getchuli(name);
    }


}
