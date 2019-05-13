package com.qf.controller;

import com.qf.pojo.Opp;
import com.qf.pojo.laiyuan;
import com.qf.service.laiyuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
@Controller
@RequestMapping("/crm_html")
public class laiyuanController {

    @Autowired
    private laiyuanService laiyuanService;


    @GetMapping("/laiyuan2")
    @ResponseBody
    public List<laiyuan> getAlllaiyuan() {
        return laiyuanService.getAlllaiyuan();
    }
}
