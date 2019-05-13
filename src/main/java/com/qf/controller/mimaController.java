package com.qf.controller;
import com.qf.pojo.mima;
import com.qf.service.mimaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller

public class mimaController {
    @Autowired
    private mimaService mimaService;
    @RequestMapping("/asds")
    @ResponseBody
    public Object logins(@RequestParam String name,@RequestParam String pass){
        System.out.println(name + "11111111111111");
        mima getmima = mimaService.getmima(name);
        if (getmima!=null) {
            String upass = getmima.getUpass();
            if(pass.equals(upass)){
                System.out.println("11111111111111");
                return true;
            }
        }
        return false;
    }



}
