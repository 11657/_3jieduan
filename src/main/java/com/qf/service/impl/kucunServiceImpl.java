package com.qf.service.impl;

import com.qf.dao.kucunDao;
import com.qf.pojo.kucun;
import com.qf.service.kucunService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class kucunServiceImpl implements kucunService {
@Resource
private kucunDao kucunDao;
    @Override
    public List<kucun> getAllkucun() {
        return kucunDao.getAllkucun();
    }

    @Override
    public boolean getAdd(kucun ls) {
        return kucunDao.getAdd(ls)>0;
    }

    @Override
    public int delkucun(int id) {
        return kucunDao.delkucun(id);
    }

    @Override
    public boolean updatekucun(kucun sh) {
        return kucunDao.updatekucun(sh)>0;
    }

    @Override
    public int get(int id) {
        return kucunDao.get(id);
    }
}
