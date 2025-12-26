package com.example.SpringJPADemo.controller;

import com.example.SpringJPADemo.model.Student;
import com.example.SpringJPADemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("/")
    public List<Student> findAll(){
        return service.findAll();
    }

    @GetMapping("/student/id/{id}")
    public Student getStudentById(@PathVariable Integer id){
        return service.getStudentById(id);
    }

    @PostMapping("/student")
    public Student save(@RequestBody Student st){
        return service.save(st);
    }



}
