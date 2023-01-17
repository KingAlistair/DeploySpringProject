package com.example.deployspringproject.controller;

import com.example.deployspringproject.model.Student;
import com.example.deployspringproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class StudentController {

    @Autowired
   private StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = studentRepository.findAll();
        return students;
    }
}
