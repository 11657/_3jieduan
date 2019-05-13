package com.qf.controller;

import com.qf.pojo.fankui;
import com.qf.pojo.jingli;
import com.qf.service.fankuiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/crm_html")
public class fankuiController {

    @Autowired
    private fankuiService fankuiService;


    @GetMapping("/fankui2")
    @ResponseBody
    public List<fankui> getAllfankui() {
        return fankuiService.getAllfankui();
    }
}

