package com.qf.controller;

import com.qf.pojo.chuli;
import com.qf.pojo.mima;
import com.qf.service.chuliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/crm_html")
public class chuliController {

    @Autowired
    private chuliService chuliService;

    @GetMapping("/chuli2")
    @ResponseBody
    public List<chuli> getAllchuli() {

        return chuliService.getAllchuli();
    }


    @RequestMapping("/asds8")
    @ResponseBody
    public Object logins(@RequestParam("name") String name) {
        System.out.println(name);
        if(name != ""){
            List<chuli> getchuli = chuliService.getchuli(name);
            System.out.println(getchuli);
            return getchuli;
        }else {
           return chuliService.getAllchuli();
        }

    }



}



