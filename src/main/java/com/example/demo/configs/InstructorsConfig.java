package com.example.demo.configs;

import com.example.demo.model.Instructor;
import com.example.demo.model.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {
    @Bean
    public Instructors tcUsaInstructors(){
        Instructors tcUsaInstructors = new Instructors();
        Instructor instructor = new Instructor(5l, "Chris");
        tcUsaInstructors.add(instructor);
        return tcUsaInstructors;
    }

    @Bean
    public Instructors tcUKInstructors(){
        Instructors tcUkInstructors = new Instructors();
        Instructor instructor = new Instructor(5l, "Chris");
        tcUkInstructors.add(instructor);
        return tcUkInstructors;
    }

    @Primary
    @Bean
    public Instructors instructors(){
        Instructors instructors = new Instructors();
        Instructor instructor1 = new Instructor(1L,"Bob");
        Instructor instructor2 = new Instructor(3L,"Smiley");



        instructors.add(instructor1);
        instructors.add(instructor2);

        return instructors;


}
}
