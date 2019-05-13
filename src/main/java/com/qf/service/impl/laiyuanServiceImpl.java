package com.qf.service.impl;

import com.qf.dao.laiyuanDao;
import com.qf.pojo.laiyuan;
import com.qf.service.laiyuanService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class laiyuanServiceImpl implements laiyuanService {
    @Resource
    private laiyuanDao laiyuanDao;
    @Override
    public List<laiyuan> getAlllaiyuan() {
        return laiyuanDao.getAlllaiyuan();
    }
}
