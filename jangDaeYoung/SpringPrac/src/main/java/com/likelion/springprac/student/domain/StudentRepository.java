package com.likelion.springprac.student.domain;

import java.util.List;

public interface StudentRepository {

    void save(Student student);
    Student findById(Long studentId);
    List<Student> findAll();
    void updateById(Long studentId, Student student);
    void deleteById(Long studentId);
}
