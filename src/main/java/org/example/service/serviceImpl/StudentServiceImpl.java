package org.example.service.serviceImpl;

import org.example.dao.StudentDao;
import org.example.dao.daoImpl.StudentDaoImpl;
import org.example.entity.Student;
import org.example.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    StudentDao studentDao=new StudentDaoImpl();
    public String saveStudent(Student student) {
        return studentDao.saveStudent(student);
    }

    public Student getStudentById(Long id) {
        return studentDao.getStudentById(id);
    }

    public List<Student> getAllStudent() {
        return studentDao.getAllStudent();
    }

    public Student updateStudent(Long oldStudentId, Student newStudent) {
        return studentDao.updateStudent(oldStudentId,newStudent);
    }

    public String deleteStudentById(Long id) {
        return studentDao.deleteStudentById(id);
    }
}
