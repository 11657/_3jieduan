package com.qf.controller;
import org.springframework.ui.Model;
import com.qf.pojo.liushi;
import com.qf.service.liushiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/crm_html")
public class liushiController {

    @Autowired
    private liushiService liushiService;


    @GetMapping("/liushi2")
    @ResponseBody
    public List<liushi> getAllliushi() {
        return liushiService.getAllliushi();
    }


    @RequestMapping("/add1")
    public String add(liushi ls, Model model) {

        liushiService.getAdd(ls);

        return "add1";
    }

    @RequestMapping("/del1")
    public String del(@RequestParam("id") int id) {
        int ok = liushiService.delliushi(id);
        System.out.println(ok > 0);
        return "1";
    }

    @GetMapping ("/update1")
    public String update(liushi sh, Model model, HttpSession session) {
        Object obj = session.getAttribute("id");
        if (obj!=null){
            int id = (Integer) obj;
            sh.setId(id);
            liushiService.updateliushi(sh);
            session.removeAttribute("id");
        }else{
            session.setAttribute("id",sh.getId());
        }
        System.out.println(sh);
        return "xiugai1";
    }
}




