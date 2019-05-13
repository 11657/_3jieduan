package com.qf.service.impl;

import com.qf.dao.jingliDao;
import com.qf.pojo.jingli;
import com.qf.service.jingliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class jingliServiceimpl implements jingliService {
    @Resource
    jingliDao jiDao;

    @Override
    public List<jingli> getAlljingli() {
        return jiDao.getAlljingli();
    }

    @Override
    public boolean updatejingli(jingli sh) {
        return jiDao.updatejingli(sh)>0;
    }

    @Override
    public int get(int id) {
        return jiDao.get(id);
    }
}
