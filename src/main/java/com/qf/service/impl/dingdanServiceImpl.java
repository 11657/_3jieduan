package com.qf.service.impl;

import com.qf.dao.dingdanDao;
import com.qf.pojo.dingdan;
import com.qf.service.dingdanService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class dingdanServiceImpl implements dingdanService {
    @Resource
    private dingdanDao ddDao;
    @Override
    public List<dingdan> getAlldingdan() {
        return ddDao.getAlldingdan();
    }



    @Override
    public boolean updatedingdan(dingdan sh) {
        return ddDao.updatedingdan(sh)>0;
    }

    @Override
    public int get(int id) {
        return ddDao.get(id);
    }


}
