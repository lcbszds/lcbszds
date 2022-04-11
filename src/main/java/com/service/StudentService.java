package com.service;

import com.pojo.Student;

public interface StudentService {
    public Student getById(String id);

    public void save(Student s);

    public void delete(String id);
}
