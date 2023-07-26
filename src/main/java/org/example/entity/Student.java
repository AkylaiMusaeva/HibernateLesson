package org.example.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="students")
@Getter
@Setter

@ToString

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "student_generator")
    @SequenceGenerator(
            name = "student_generator",
            sequenceName = "student_sequence",
            allocationSize = 1)
    private Long id;
    @Column(name ="first_name",length = 50,nullable = false)
    private String firstNam;
    @Column(name="last_name")
    private String lastName;
    @Column(unique = true)
    private String email;
    private int age;

    public Student() {
    }

    public Student(String firstNam, String lastName, String email, int age) {
        this.firstNam = firstNam;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

}
