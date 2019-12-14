package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
@Component
public class Alumni {
    @Autowired
    @Qualifier("previousStudents")
    Students students;

    @Autowired
    Instructors instructors;


    public Alumni(Instructors instructors, @Qualifier("previousStudents") Students students){
        this.instructors = instructors;
        this.students = students;
    }

    @PostConstruct
    public void excecuteBootcamp(){
        int numberOfInstructors = instructors.size();
        int numberOfStudents = students.size();
        double numberOfHoursToTeachEachStudent = 1200;
        double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
        double numberOfHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;
        for (Instructor i : instructors.listOfPeople){
            i.lecture(students.listOfPeople, numberOfHoursPerInstructor);
        }
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }
}
