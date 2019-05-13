package com.qf.controller;

import com.qf.pojo.TestOne;
import com.qf.service.TestOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestOneController {
    @Autowired
    TestOneService testOneService;
    @RequestMapping("alltest")
    public List<TestOne> allTest() {


        return testOneService.all();
    }
}
