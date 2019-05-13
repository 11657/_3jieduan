package com.qf.service.impl;

import com.qf.dao.fuwuDao;
import com.qf.pojo.fuwu;
import com.qf.service.fuwuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class fuwuServiceImpl implements fuwuService {
    @Resource
    private fuwuDao fuwuDao;
    @Override
    public List<fuwu> getAllfuwu() {
        return fuwuDao.getAllfuwu();
    }

    @Override
    public boolean getAdd(fuwu ls) {
        return fuwuDao.getAdd(ls)>0;
    }

    @Override
    public int delfuwu(int id) {
        return fuwuDao.delfuwu(id);
    }

    @Override
    public boolean updatefuwu(fuwu sh) {
        return fuwuDao.updatefuwu(sh)>0;
    }


    @Override
    public fuwu selectfuwuByid(int id) {
        return fuwuDao.selectfuwuByid(id);
    }
}
