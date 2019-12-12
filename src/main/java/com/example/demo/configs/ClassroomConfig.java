package com.example.demo.configs;

import com.example.demo.model.Classroom;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassroomConfig {

    @Bean
    public Classroom currentCohort(){

    }

    public Classroom previousCohort(){

    }

}
