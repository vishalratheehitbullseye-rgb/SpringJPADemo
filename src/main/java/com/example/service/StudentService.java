package com.example.service;

import com.example.model.Student;
import com.example.repo.StudentRepo;
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
}
