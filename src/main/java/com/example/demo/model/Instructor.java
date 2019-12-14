package com.example.demo.model;

import java.util.ArrayList;

public class Instructor extends Person implements Teacher{
    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);

    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        ArrayList<Learner> learnersList = new ArrayList<>();
        learners.forEach(learnersList:: add);
        double numberOfHoursPerLearner = numberOfHours / learnersList.size();
        for (Learner l : learners){
            l.learn(numberOfHoursPerLearner);

        }


    }
}
