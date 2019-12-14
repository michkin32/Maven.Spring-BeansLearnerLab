package com.example.demo.model;

import java.util.List;

public class Students extends People<Student> {

  public Students(List<Student> personList){
      super(personList);
  }

    public Students() {

    }
}
