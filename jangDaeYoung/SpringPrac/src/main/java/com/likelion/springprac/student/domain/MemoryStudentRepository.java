package com.likelion.springprac.student.domain;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class MemoryStudentRepository implements StudentRepository{

    private static Map<Long, Student> database = new HashMap<>();

    @Override
    public void save(Student student) {
        database.put(student.getStudentId(), student);
    }

    @Override
    public Student findById(Long studentId) {
        return database.get(studentId);
    }

    @Override
    public List<Student> findAll() {
        return database.values().stream().toList();
    }

    @Override
    public void updateById(Long studentId, Student student) {
        database.put(studentId, student);
    }

    @Override
    public void deleteById(Long studentId) {
        database.remove(studentId);
    }
}
