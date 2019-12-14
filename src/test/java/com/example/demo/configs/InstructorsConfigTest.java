package com.example.demo.configs;

import com.example.demo.model.Instructors;
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
class InstructorsConfigTest {

    @Autowired
    @Qualifier("tcUsaInstructors")
    Instructors tcUsaInstructors;

    @Autowired
    @Qualifier("tcUKInstructors")
    Instructors tcUkInstructors;

    @Autowired
    @Qualifier("instructors")
    private Instructors instructors;




    @Test
    public void tcUsaInstructors()  {
        Assert.assertTrue(tcUsaInstructors.size() == 1);
    }

    @Test
    public void setTcUkInstructors()  {
        Assert.assertTrue(tcUkInstructors.size() == 1);
    }

    @Test
    public void instructors() {
        Assert.assertTrue(instructors.size() == 2);
    }
}