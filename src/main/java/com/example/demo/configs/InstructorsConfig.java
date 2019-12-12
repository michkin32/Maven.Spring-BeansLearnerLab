package com.example.demo.configs;

import com.example.demo.model.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {
    @Bean
    public Instructors tcUsaInstructors(){

    }

    @Bean
    public Instructors tcUKInstructors(){

    }

    @Primary
    @Bean
    public Instructors instructors(){

    }
}
