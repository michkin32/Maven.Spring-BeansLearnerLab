package com.example.demo.model;

public class Student extends Person implements Learner{

    public double getTotalStudyTime() {
        return totalStudyTime;
    }

    double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }
}
