package com.qf.controller;


import com.qf.pojo.Opp;

import com.qf.service.OppService;
import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/crm_html")
public class OppController {

    @Autowired
    private OppService oppService;

    @GetMapping("/Opp2")
    @ResponseBody
    public List<Opp> getAllOpp() {
        return oppService.getAllOpp();
    }

    @GetMapping ("/update7")
    public String update(Opp sh, Model model, HttpSession session) {
        Object obj = session.getAttribute("id");
        if (obj!=null){
            int id = (Integer) obj;
            sh.setId(id);
            oppService.updateOpp(sh);

            session.removeAttribute("id");
        }else{
            session.setAttribute("id",sh.getId());
        }
        System.out.println(sh);
        return "xiugai5";
    }

}
