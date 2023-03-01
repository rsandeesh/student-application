package com.sandeesh.StudentApplicationSystem.service.impl;

import com.sandeesh.StudentApplicationSystem.model.Student;
import com.sandeesh.StudentApplicationSystem.repository.StudentRepository;
import com.sandeesh.StudentApplicationSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService
{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents()
    {
        return studentRepository.findAll();
    }
}
