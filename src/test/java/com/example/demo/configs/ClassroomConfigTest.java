package com.example.demo.configs;

import com.example.demo.model.Classroom;
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
class ClassroomConfigTest {
    @Autowired
    @Qualifier("currentCohort")
    private Classroom currentCohort;



    @Autowired
    @Qualifier("previousCohort")
    private Classroom previousCohort;



    @Test
    public void currentCohortTest() {
        Assert.assertTrue(currentCohort.getInstructorList().findById(1L) != null);
        Assert.assertTrue(currentCohort.getStudentList().findById(2L) != null);
    }


    @Test
    public void previousCohortTest() {
        Assert.assertTrue(previousCohort.getInstructorList().findById(3L) != null);
        Assert.assertTrue(previousCohort.getStudentList().findById(1L) != null);
    }
}