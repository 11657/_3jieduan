package com.qf.controller;

import com.qf.pojo.kucun;
import com.qf.service.kucunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/crm_html")
public class kucunController {

    @Autowired
    private kucunService kucunService;

    @GetMapping("/kucun2")
    @ResponseBody
    public List<kucun> getAllkucun() {
        return kucunService.getAllkucun();
    }
    @RequestMapping("/add4")
    public String add( kucun ls,Model model) {

        kucunService.getAdd(ls);

        return "add";
    }
    @RequestMapping("/del4")
    public String del(@RequestParam("id") int id) {
        int ok=kucunService.delkucun(id);
        System.out.println(ok>0);
        return "222";
    }

    @GetMapping ("/update4")
    public String update(kucun sh, Model model, HttpSession session) {
        Object obj = session.getAttribute("id");
        if (obj!=null){
            int id = (Integer) obj;
            sh.setId(id);
            kucunService.updatekucun(sh);
            session.removeAttribute("id");
        }else{
            session.setAttribute("id",sh.getId());
        }
        System.out.println(sh);
        return "303";
    }
}