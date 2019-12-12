package com.example.demo.configs;

import com.example.demo.model.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean(name = "students")
    public Students currentStudents(){

    }

    @Bean
    public Students previousStudents(){

    }

}
