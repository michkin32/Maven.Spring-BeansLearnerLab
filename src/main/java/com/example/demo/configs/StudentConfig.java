package com.example.demo.configs;

import com.example.demo.model.Student;
import com.example.demo.model.Students;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean(name = "currentStudents")
    public Students currentStudents(){
        Students currentStudents = new Students();
        Student newStudent = new Student(1, "Bob");
        Student newStudent2 = new Student(2, "Jane");
        currentStudents.add(newStudent);
        currentStudents.add(newStudent2);
        return currentStudents;
    }

    @Bean
    @Qualifier("previousStudents")
    public Students previousStudents(){
        Students previousStudents = new Students();
        Student newStudent = new Student(1, "Bob");
        Student newStudent2 = new Student(2, "Jane");
        previousStudents.add(newStudent);
        previousStudents.add(newStudent2);
        return previousStudents;
    }

}
