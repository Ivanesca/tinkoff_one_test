package com.example.tinkoff_one_test;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Getter
@Setter
@Table("students")
public class Student {
    @Id
    private UUID id;
    @Column("name")
    private String name;
    @Column("age")
    private int age;
    @Column("time_from")
    private int timeFrom;
    @Column("time_to")
    private int timeTo;
//    @Column("course")
//    private Course course;

    public Student(String name, int age) {
        this(name, age, 10, 12);
    }

//    public Student(String name, int age, int time_from, int time_to, Course course) {
//        id = UUID.randomUUID();
//        this.name = name;
//        this.age = age;
//        this.timeFrom = time_from;
//        this.timeTo = time_to;
//        this.course = course;
//    }

    public Student(String name, int age, int time_from, int time_to) {
        id = UUID.randomUUID();
        this.name = name;
        this.age = age;
        this.timeFrom = time_from;
        this.timeTo = time_to;
    }
}
