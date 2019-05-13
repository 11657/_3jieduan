package com.qf.dao;

import com.qf.pojo.Student;

import java.util.List;

public interface IStudentDao {


        List<Student> getAllStudent();

        Student getStudentBySid(int sid);

        int updateStudent(Student stu);

        int saveStudent(Student stu);

        int insertStudent(Student stu);

    }
