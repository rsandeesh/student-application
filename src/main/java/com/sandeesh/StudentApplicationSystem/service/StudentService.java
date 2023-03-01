package com.sandeesh.StudentApplicationSystem.service;

import com.sandeesh.StudentApplicationSystem.model.Student;

import java.util.List;

public interface StudentService
{
    Student saveStudent(Student student);
    List<Student> getAllStudents();
}
