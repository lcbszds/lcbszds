package com.service;

import com.dao.StudentDao;
import com.pojo.Student;
import com.tool.SqlSessionUtil;

public class StudentServiceimpl implements StudentService{

    private StudentDao studentDao = SqlSessionUtil.getSession().getMapper(StudentDao.class);

    @Override
    public Student getById(String id) {
        Student s= studentDao.getById(id);
        return s;
    }

    @Override
    public void save(Student s) {
        studentDao.save(s);
    }

    @Override
    public void delete(String id) {
        studentDao.delete(id);
    }
}
