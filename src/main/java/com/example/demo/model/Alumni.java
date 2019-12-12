package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class Alumni {
    @Autowired
   Students students;
    @Autowired
    Instructors instructors;

    @PostConstruct
    public void excecuteBootcamp(){

    }
}
