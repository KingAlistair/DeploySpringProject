package com.example.deployspringproject.config;

import com.example.deployspringproject.model.Student;
import com.example.deployspringproject.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class StartAndSave implements CommandLineRunner {
    StudentRepository studentRepository;

    public StartAndSave(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Student student1 = new Student(LocalDate.now(), LocalTime.now(), "Peter");
        Student student2 = new Student(LocalDate.now(), LocalTime.now(), "Mark");

        studentRepository.save(student1);
        studentRepository.save(student2);
    }

}
