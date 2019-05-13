package com.qf.controller;

import com.qf.pojo.fuwu;
import com.qf.service.fuwuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/crm_html")
public class fuwuController {

    @Autowired
    private fuwuService fuwuService;


    @GetMapping("/fuwu2")
    @ResponseBody
    public List<fuwu> getAllfuwu() {
        return fuwuService.getAllfuwu();
    }

    @RequestMapping("/add")
    public String add( fuwu ls,Model model) {

        fuwuService.getAdd(ls);

        return "add";
    }
    @RequestMapping("/del")
    public String del(@RequestParam("id") int id) {
        int ok=fuwuService.delfuwu(id);
        System.out.println(ok>0);
        return "3";
    }

    @GetMapping ("/update")
    public String update(fuwu sh, Model model, HttpSession session) {
        Object obj = session.getAttribute("id");
        if (obj!=null){
            int id = (Integer) obj;
            sh.setId(id);
            fuwuService.updatefuwu(sh);
            session.removeAttribute("id");
        }else{
           // fuwu fuwu = fuwuService.selectfuwuByid(sh.getId());


            session.setAttribute("id",sh.getId());
        }
        System.out.println(sh);
        return "xiugai";
    }

}