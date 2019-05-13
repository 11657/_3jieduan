package com.qf.service.impl;

import com.qf.dao.liushiDao;
import com.qf.pojo.liushi;
import com.qf.service.liushiService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class liushiServiceimpl implements liushiService {
    @Resource
    private liushiDao liushiDao;


    @Override
    public List<liushi> getAllliushi() {
        return liushiDao.getAllliushi();
    }

    @Override
    public boolean getAdd(liushi ls) {
        return liushiDao.getAdd(ls) > 0;
    }

    @Override
    public boolean  updateliushi(liushi sh) {
        return liushiDao.updateliushi(sh)>0;
    }

    @Override
    public int delliushi(int id) {
        return liushiDao.delliushi(id);
    }

    @Override
    public int get(int id) {
        return liushiDao.get(id);
    }
}