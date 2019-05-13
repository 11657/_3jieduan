package com.qf.controller;

import com.qf.pojo.jingli;
import com.qf.service.jingliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/crm_html")
   public  class jingliController {

    @Autowired
    private jingliService jingliService;


    @GetMapping("/jingli2")
    @ResponseBody
    public List<jingli> getAlljingli() {
        return jingliService.getAlljingli();
    }




    @GetMapping ("/update6")
    public String update(jingli sh, Model model, HttpSession session) {
        Object obj = session.getAttribute("id");
        if (obj!=null){
            int id = (Integer) obj;
            sh.setId(id);
           jingliService.updatejingli(sh);
            session.removeAttribute("id");
        }else{
            session.setAttribute("id",sh.getId());
        }
        System.out.println(sh);
        return "xiugai4";
    }



}

