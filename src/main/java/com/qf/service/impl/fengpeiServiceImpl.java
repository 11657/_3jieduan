package com.qf.service.impl;

import com.qf.dao.fengpeiDao;
import com.qf.pojo.fengpei;
import com.qf.service.fengpeiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class fengpeiServiceImpl implements fengpeiService {
    @Resource
    private  fengpeiDao fengpeiDao;
    @Override
    public List<fengpei> getAllfengpei() {
        return fengpeiDao.getAllfengpei();
    }

    @Override
    public int delfengpei(int id) {
        return fengpeiDao.delfengpei(id);
    }


}
