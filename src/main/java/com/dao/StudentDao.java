package com.dao;

import com.pojo.Student;

public interface StudentDao {
    public Student getById(String id);

    public void save(Student s);

    public void delete(String id);
}
