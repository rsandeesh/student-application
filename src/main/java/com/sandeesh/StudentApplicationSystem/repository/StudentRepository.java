package com.sandeesh.StudentApplicationSystem.repository;

import com.sandeesh.StudentApplicationSystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
