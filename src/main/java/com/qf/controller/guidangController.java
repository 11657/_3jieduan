package com.qf.controller;

import com.qf.pojo.gongxie;
import com.qf.pojo.guidang;
import com.qf.service.guidangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/crm_html")
public class guidangController {

    @Autowired
    private guidangService guidangService;

    @GetMapping("/guidang2")
    @ResponseBody
    public List<guidang> getAllguidang() {
        return guidangService.getAllguidang();
    }


    @GetMapping("/update9")
    public String update(guidang sh, Model model, HttpSession session) {
        Object obj = session.getAttribute("id");
        if (obj != null) {
            int id = (Integer) obj;
            sh.setId(id);
            guidangService.updateguidang(sh);
            session.removeAttribute("id");
        } else {
            session.setAttribute("id", sh.getId());
        }
        System.out.println(sh);
        return "hh/xiugai6";
    }

    @RequestMapping("/add9")
    public String add(guidang ls, Model model) {
        guidangService.getAdd(ls);

        return "hh/dingDanLuRu";
    }
}
