package com.example.demo.model;

import java.util.List;
import java.util.Set;

public class Classroom {
    Instructors instructorList;
    Students studentList;

    public Classroom(Instructors instructors, Students students){
    this.instructorList = instructors;
    this.studentList = students;
    }
    public void hostLecture(Teacher teacher, double numberOfHours) {

        teacher.lecture(studentList, numberOfHours);

    }
    public Instructors getInstructorList() {
        return instructorList;
    }

    public Students getStudentList() {
        return studentList;
    }


}
