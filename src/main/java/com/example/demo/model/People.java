package com.example.demo.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public abstract class People<PersonType extends Person> implements Iterable<PersonType>{
    List<PersonType> listOfPeople;

    public People(List<PersonType> list){
        this.listOfPeople = list;
    }
    public People(){
        this.listOfPeople = new ArrayList<>();
    }
    public void add(PersonType person){
        listOfPeople.add(person);
    }
    public void addAll(Iterable<PersonType> person){
        for(PersonType p : person){
        listOfPeople.add(p);
        }
    }

    public PersonType findById(long id){
        Person foundPerson = null;
        for (Person p : listOfPeople) {
            if (p.id == id){
                foundPerson = p;
            }
        }
        return (PersonType) foundPerson;
    }
    public List<PersonType> findAll() {
        return listOfPeople;
    }

        public void remove(PersonType person){
            listOfPeople.remove(person);
        }
    public void clear(){
        listOfPeople.clear();
    }

    public Integer size(){
        return listOfPeople.size();
    }


    @Override
    public Iterator<PersonType> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super PersonType> action) {

    }

    @Override
    public Spliterator<PersonType> spliterator() {
        return null;
    }
}
