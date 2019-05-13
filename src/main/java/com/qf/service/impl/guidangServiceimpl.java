package com.qf.service.impl;

import com.qf.dao.guidangDao;
import com.qf.pojo.guidang;
import com.qf.service.guidangService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class guidangServiceimpl  implements guidangService {
    @Resource
    private guidangDao guidangDao;
    @Override
    public List<guidang> getAllguidang() {
        return guidangDao.getAllguidang();
    }

    @Override
    public boolean getAdd(guidang ls) {
        return guidangDao.getAdd(ls)>0;
    }

    @Override
    public boolean updateguidang(guidang sh) {
        return guidangDao.updateguidang(sh)>0;
    }

    @Override
    public int get(int id) {
        return guidangDao.get(id);
    }
}
