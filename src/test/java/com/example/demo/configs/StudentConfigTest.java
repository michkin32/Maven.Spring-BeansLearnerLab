package com.example.demo.configs;

import com.example.demo.model.Students;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class StudentConfigTest {


    @Autowired
    @Qualifier("currentStudents")
    private Students currentStudents;


    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;



    @Test
    public void currentStudents() {
        Assert.assertTrue(currentStudents.size() == 2);
    }

    @Test
    public void previousStudents()   {
        Assert.assertTrue(previousStudents.size() == 2);
    }
}