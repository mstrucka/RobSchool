package controller;

import container.PersonContainer;
import model.Person;

import java.util.LinkedList;
import java.util.List;

public class PersonController {
//    public boolean addPersonByFields(String name, int age) {return PersonContainer.getInstance().addPersonByFields(name, age);}
    public boolean editPersonByFields(String name, int age) {return PersonContainer.getInstance().editPersonByFields(name, age);}
    // TODO: spravit ostatne
    public boolean addPersonByObject(Person p) {return false;}
    public boolean editPersonByObject(Person p) {return false;}
    public Person getPersonByName(String name) {return null;}
    public List<Person> getPeopleByAgeMoreThan(int age) {return null;}
    public void removePersonByObject(Person p) {}
    public void removePersonByName(String name) {}
    public LinkedList<Person> getAllPeople() {return null;}


}
