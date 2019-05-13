package com.qf.service;

import com.qf.pojo.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getAllStudent();

    Student getStudentBySid(int sid);

    int updateStudent(Student stu);

    int saveStudent(Student stu);

    int insertStudent(Student stu);

}

