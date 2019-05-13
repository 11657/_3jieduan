package com.qf.service.impl;

import com.qf.dao.IStudentDao;
import com.qf.pojo.Student;
import com.qf.service.IStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {


    @Resource
    private IStudentDao stuDao;

    public List<Student> getAllStudent() {

        return stuDao.getAllStudent();
    }

    public Student getStudentBySid(int sid) {

        return stuDao.getStudentBySid(sid);
    }

    public int updateStudent(Student stu) {

        return stuDao.updateStudent(stu);
    }

    public int saveStudent(Student stu) {

        return stuDao.saveStudent(stu);
    }

    public int insertStudent(Student stu) {

        return stuDao.insertStudent(stu);
    }

}
