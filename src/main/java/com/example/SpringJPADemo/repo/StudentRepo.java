package com.example.SpringJPADemo.repo;


import com.example.SpringJPADemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
    public Student save(Student st);

    public Student getStudentById(Integer id);
}
