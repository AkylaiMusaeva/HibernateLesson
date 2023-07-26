package org.example;

import org.example.entity.Student;
import org.example.service.StudentService;
import org.example.service.serviceImpl.StudentServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StudentService studentService=new StudentServiceImpl();
        System.out.println(studentService.saveStudent(new Student("Adilet", "Askaraliev", "adigmail", 24)));
//        System.out.println(studentService.getStudentById(1L));
        System.out.println(studentService.getAllStudent());
//        System.out.println(studentService.updateStudent(1L,
//                new Student("Marat", "Musaev", "marat@gmail.com", 26)));
//        System.out.println(studentService.deleteStudentById(1L));






    }
}
