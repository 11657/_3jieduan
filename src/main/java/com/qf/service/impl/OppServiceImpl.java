package com.qf.service.impl;

import com.qf.dao.oppDao;
import com.qf.pojo.Opp;
import com.qf.service.OppService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class OppServiceImpl implements OppService {
    @Resource
    private oppDao oppDao;
    @Override
    public List<Opp> getAllOpp() {
        return oppDao.getAllOpp();
    }

    @Override
    public boolean updateOpp(Opp sh) {
        return oppDao.updateOpp(sh)>0;
    }

    @Override
    public int get(int id) {
        return oppDao.get(id);
    }
}
