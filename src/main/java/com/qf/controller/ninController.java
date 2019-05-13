package com.qf.controller;

import com.qf.pojo.nim;
import com.qf.pojo.nin;
import com.qf.service.ninService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ninController {
    @Autowired
    private ninService ninService;

    @RequestMapping("/asds3")
    @ResponseBody
    public Object logins(@RequestParam String name, @RequestParam String pass){

        nin getnin = ninService.getnin(name);
        if (getnin!=null) {
            String upass = getnin.getUpass();
            if(pass.equals(upass)){

                return true;
            }
        }
        return false;
    }
}
