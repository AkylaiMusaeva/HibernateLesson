package org.example.service;

import org.example.entity.Student;

import java.util.List;

public interface StudentService {
    String saveStudent(Student student);
    Student getStudentById(Long id);
    List<Student> getAllStudent();
    Student updateStudent(Long oldStudentId,Student newStudent);
    String deleteStudentById(Long id);
}
