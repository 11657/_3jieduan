package com.qf.service.impl;
import com.qf.dao.mimDao;
import com.qf.pojo.mim;
import com.qf.service.mimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class mimServiceimpl implements mimService {
    @Autowired
  private mimDao mimDao;

    @Override
    public mim getmim(String name) {
        return mimDao.getmim(name);
    }
}
