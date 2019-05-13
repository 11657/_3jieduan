package com.qf.controller;

import com.qf.pojo.mim;
import com.qf.pojo.nim;
import com.qf.service.nimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class nimController {
    @Autowired
    private nimService nimService;

    @RequestMapping("/asds2")
    @ResponseBody
    public Object logins(@RequestParam String name, @RequestParam String pass){

        nim getnim = nimService.getnim(name);
        if (getnim!=null) {
            String upass = getnim.getUpass();
            if(pass.equals(upass)){

                return true;
            }
        }
        return false;
    }
}
