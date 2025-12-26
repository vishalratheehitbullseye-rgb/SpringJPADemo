package com.example.SpringJPADemo.service;

import com.example.SpringJPADemo.model.Student;
import com.example.SpringJPADemo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo repo;
    public List<Student> findAll() {
        return repo.findAll();
    }

    public Student save(Student st) {
        return repo.save(st);
    }

    public Student getStudentById(Integer id) {
        return repo.getStudentById(id);
    }
}
