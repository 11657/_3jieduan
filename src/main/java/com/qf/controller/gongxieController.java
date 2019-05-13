package com.qf.controller;

import com.qf.pojo.gongxie;
import com.qf.service.gongxieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/crm_html")
public class gongxieController {

    @Autowired
    private gongxieService gongxieService;


    @GetMapping("/gongxie2")
    @ResponseBody
    public List<gongxie> getAllgongxie() {
        return gongxieService.getAllgongxie();
    }

    @RequestMapping("/add5")
    public String add(gongxie ls, Model model) {
        gongxieService.getAdd(ls);

        return "add3";
    }
    @RequestMapping("/del5")
    public String del(@RequestParam("id") int id) {
        int ok=gongxieService.delgongxie(id);
        System.out.println(ok>0);
        return "444";
    }

    @GetMapping ("/update5")
    public String update(gongxie sh, Model model, HttpSession session) {
        Object obj = session.getAttribute("id");
        if (obj!=null){
            int id = (Integer) obj;
            sh.setId(id);
            gongxieService.updategongxie(sh);
            session.removeAttribute("id");
        }else{
            session.setAttribute("id",sh.getId());
        }
        System.out.println(sh);
        return "xiugai3";
    }

}