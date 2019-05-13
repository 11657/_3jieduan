package com.qf.controller;

import com.qf.pojo.dingdan;
import com.qf.service.dingdanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/crm_html")
public class dingdanController {

    @Autowired
    private dingdanService dingdanService;

    @GetMapping("/dingdan2")
    @ResponseBody
    public List<dingdan> getAlldingdan() {
        return dingdanService.getAlldingdan();
    }

    @GetMapping("/update8")
    public String update(dingdan sh, Model model, HttpSession session) {
        Object obj = session.getAttribute("id");
        if (obj != null) {
            int id = (Integer) obj;
            sh.setId(id);
            dingdanService.updatedingdan(sh);
            session.removeAttribute("id");
        } else {
            session.setAttribute("id", sh.getId());
        }
        System.out.println(sh);
        return "xiugai6";


    }
}