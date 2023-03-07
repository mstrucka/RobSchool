package container;

import model.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PersonContainer {
    private static PersonContainer instance;
    private final LinkedList<Person> people;

    Person person;
    private PersonContainer() {
        people = new LinkedList<>();
//        people.add(new Person("Marek", 24));

    }

    public static PersonContainer getInstance() {
        if (instance == null) {
            instance = new PersonContainer();
        }
        return instance;
    }

    // TODO: implementacia
//    public static boolean addPersonByFields(String name, int age) {
//        return people.add(person);}
    public boolean editPersonByFields(String name, int age) {return false;}
    public boolean addPersonByObject(Person p) {
        people.add(p);
        return false;}
    public boolean editPersonByObject(Person p) {return false;}
    public Person getPersonByName(String name) {return null;}
    public List<Person> getPeopleByAgeMoreThan(int age) {return null;}
    public void removePersonByObject(Person p) {}
    public void removePersonByName(String name) {}
    public LinkedList<Person> getAllPeople() {return null;}


}
