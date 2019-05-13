package com.qf.controller;


import com.qf.pojo.User;
import com.qf.service.UserService;
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
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/User2")
    @ResponseBody
    public List<User> getAllUser() {
        return userService.getAllUser();
    }
    @RequestMapping("/add2")
    public String add(User ls, Model model) {

        userService.getAdd(ls);

        return "add2";
    }
    @RequestMapping("/del2")
    public String del(@RequestParam("id") int id) {
        int ok=userService.delUser(id);
        System.out.println(ok>0);
        return "2";
    }

    @GetMapping ("/update2")
    public String update(User sh, Model model, HttpSession session) {
        Object obj = session.getAttribute("id");
        if (obj!=null){
            int id = (Integer) obj;
            sh.setId(id);
           userService.updateUser(sh);
            session.removeAttribute("id");
        }else{
            session.setAttribute("id",sh.getId());
        }
        System.out.println(sh);
        return "xiugai2";
    }

}