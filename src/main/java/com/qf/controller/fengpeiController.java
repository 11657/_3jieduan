package com.qf.controller;

import com.qf.pojo.fengpei;
import com.qf.service.fengpeiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/crm_html")
public class fengpeiController {

    @Autowired
    private fengpeiService fengpeiService;


    @GetMapping("/fengpei2")
    @ResponseBody
    public List<fengpei> getAllfengpei() {
        return fengpeiService.getAllfengpei();
    }
    @RequestMapping("/del3")
    public String del(@RequestParam("id") int id) {
        int ok=fengpeiService.delfengpei(id);
        System.out.println(ok>0);
        return "4";
    }
}
