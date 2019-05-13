package com.qf.controller;

import com.qf.pojo.changping;
import com.qf.service.changpingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/crm_html")
public class changpingController {

    @Autowired
    private changpingService changpingService;

    @GetMapping("/changping2")
    @ResponseBody
    public List<changping> getAllchangping() {
        return changpingService.getAllchangping();
    }

}
