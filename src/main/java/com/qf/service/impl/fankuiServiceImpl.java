package com.qf.service.impl;

import com.qf.dao.fankuiDao;
import com.qf.pojo.fankui;
import com.qf.service.fankuiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class fankuiServiceImpl implements fankuiService {
    @Resource
    private fankuiDao fankuiDao;
    @Override
    public List<fankui> getAllfankui() {
        return fankuiDao.getAllfankui();
    }
}
