package com.example.demo.configs;

import com.example.demo.model.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {
    @DependsOn({"instructors", "currentStudents"})
    @Bean
    public Classroom currentCohort(Instructors instructors, @Qualifier("currentStudents") Students students){
        Classroom classroom = new Classroom(instructors, students);
        return classroom;
    }
    @DependsOn({"instructors", "previousStudents"})
    @Bean
    public Classroom previousCohort(Instructors instructors, @Qualifier("previousStudents") Students students){

        Classroom classroom = new Classroom(instructors, students);
        return classroom;
    }

}
