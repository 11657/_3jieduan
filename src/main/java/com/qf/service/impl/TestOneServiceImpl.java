package com.qf.service.impl;

import com.qf.dao.TestOneDao;
import com.qf.pojo.TestOne;
import com.qf.service.TestOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestOneServiceImpl implements TestOneService {
    @Autowired
    TestOneDao testOneDao;
    @Override
    public List<TestOne> all() {
        return testOneDao.all();
    }
}
