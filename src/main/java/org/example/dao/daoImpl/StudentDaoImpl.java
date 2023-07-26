package org.example.dao.daoImpl;

import org.example.config.HibernateConfig;
import org.example.dao.StudentDao;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    public String saveStudent(Student student) {
        Session session = HibernateConfig.getSession().openSession();
        session.beginTransaction();
        session.persist(student);
        session.getTransaction().commit();
        session.close();
        return student.getFirstNam()+ " student is saved successfully!";
    }

    public Student getStudentById(Long id) {
       Session session=HibernateConfig.getSession().openSession();
       session.beginTransaction();
       Student student=session.get(Student.class,id);
       session.getTransaction().commit();
       session.close();
        return student;
    }

    public List<Student> getAllStudent() {
        Session session=HibernateConfig.getSession().openSession();
        session.beginTransaction();
        List<Student> students = session.createQuery("select s from Student s",Student.class).getResultList();
        session.getTransaction().commit();
        session.close();
        return students;

    }

    public Student updateStudent(Long oldStudentId, Student newStudent) {
        Session session=HibernateConfig.getSession().openSession();
        session.beginTransaction();
        Student oldStudent = getStudentById(oldStudentId);

        oldStudent.setFirstNam(newStudent.getFirstNam());
        oldStudent.setLastName(newStudent.getLastName());
        oldStudent.setEmail(newStudent.getEmail());
        oldStudent.setAge(newStudent.getAge());
        session.merge(oldStudent);
        session.getTransaction().commit();
        session.close();
        return oldStudent;

    }

    public String deleteStudentById(Long id) {
        Session session=HibernateConfig.getSession().openSession();
        session.beginTransaction();
        Student student=getStudentById(id);
        session.remove(student);
        session.getTransaction().commit();
        session.close();
        return student.getFirstNam()+" is deleted successfully!";

    }
}
