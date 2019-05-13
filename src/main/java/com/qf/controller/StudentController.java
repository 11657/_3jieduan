package com.qf.controller;




//@Controller

import javax.annotation.Resource;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qf.Volidate.StudentValidate;

import com.qf.pojo.Student;
import com.qf.service.IStudentService;
@Controller
public class StudentController {


   @Resource
   private IStudentService stuService;

   @GetMapping("/getAllStu")
   public String getAllStudents(Model model){

      List<Student> list = stuService.getAllStudent();

      model.addAttribute("list", list);

      return "allStu";
   }
   @GetMapping("/saveStu")
   public String showSaveStudentForm(Model model){

      model.addAttribute("student", new Student());

      return "saveStu";
   }

   @PostMapping("/saveStu")
   public String saveStudent(Student student, BindingResult errors, Model model){

      StudentValidate sv= new StudentValidate();

      sv.validate(student, errors);

      if(errors.hasErrors()){
         model.addAttribute("student", student);
         return "saveStu";
      }

      return "redirect:/getAllStu";
   }

   @RequestMapping(value="/updateStudent", method=RequestMethod.POST)
   public String updateEmp(Student Student){

      System.out.println(Student);

      stuService.updateStudent(Student);

      return "redirect:/getAllEmp";
   }
}

