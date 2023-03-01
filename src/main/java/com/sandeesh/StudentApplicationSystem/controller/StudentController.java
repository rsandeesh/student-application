package com.sandeesh.StudentApplicationSystem.controller;

import com.sandeesh.StudentApplicationSystem.model.Student;
import com.sandeesh.StudentApplicationSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController
{
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New Student Added";
    }

    @GetMapping("get")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
