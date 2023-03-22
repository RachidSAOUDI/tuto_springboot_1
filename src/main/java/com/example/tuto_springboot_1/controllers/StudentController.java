package com.example.tuto_springboot_1.controllers;

import com.example.tuto_springboot_1.entities.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    // http://localhost:8080/student
    @GetMapping("/student")
    public Student getStudent(){
        return new Student("Rachid", "saoudi");
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students=new ArrayList<>();
        students.add(new Student("Kamal","Ahmadi"));
        students.add(new Student("Said","Jawadi"));
        students.add(new Student("Hassan","Nouri"));
        students.add(new Student("Jawad","Smaki"));
        students.add(new Student("Jalal","Alaoui"));
        return students;
    }
}
