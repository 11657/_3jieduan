package com.qf.controller;


import com.qf.pojo.mim;
import com.qf.service.mimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mimController  {
    @Autowired
    private mimService mimService;

    @RequestMapping("/asds1")
    @ResponseBody
    public Object logins(@RequestParam String name, @RequestParam String pass){

        mim getmim = mimService.getmim(name);
        if (getmim!=null) {
            String upass = getmim.getUpass();
            if(pass.equals(upass)){

                return true;
            }
        }
        return false;
    }
}
