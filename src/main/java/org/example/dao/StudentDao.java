package org.example.dao;

import org.example.entity.Student;

import java.util.List;

public interface StudentDao {
    //crud
    String saveStudent(Student student);
    Student getStudentById(Long id);
    List<Student> getAllStudent();
    Student updateStudent(Long oldStudentId,Student newStudent);
    String deleteStudentById(Long id);
}
