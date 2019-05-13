package com.qf.service.impl;

import com.qf.dao.changpingDao;
import com.qf.pojo.changping;
import com.qf.service.changpingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class changpingServiceimpl implements changpingService {
    @Resource
    private changpingDao  cpDao;
    @Override
    public List<changping> getAllchangping() {
        return cpDao.getAllchangping();
    }
}
