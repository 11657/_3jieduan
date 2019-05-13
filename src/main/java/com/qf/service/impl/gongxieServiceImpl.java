package com.qf.service.impl;

import com.qf.dao.gongxieDao;
import com.qf.pojo.gongxie;
import com.qf.service.gongxieService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class gongxieServiceImpl  implements gongxieService {
    @Resource
    private gongxieDao gongxieDao;
    @Override
    public List<gongxie> getAllgongxie() {
        return gongxieDao.getAllgongxie();
    }

    @Override
    public boolean getAdd(gongxie ls) {
        return gongxieDao.getAdd(ls)>0;
    }

    @Override
    public int delgongxie(int id) {
        return gongxieDao.delgongxie(id);
    }

    @Override
    public boolean updategongxie(gongxie sh) {
        return gongxieDao.updategongxie(sh)>0;
    }

    @Override
    public int get(int id) {
        return gongxieDao.get(id);
    }
}
