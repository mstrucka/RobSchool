package container;

import model.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PersonContainer {
    private static PersonContainer instance;
    private static LinkedList<Person> people;

    public PersonContainer() {
        people = new LinkedList<>();
    }

    public static PersonContainer getInstance() {
        if (instance == null) {
            instance = new PersonContainer();
        }
        return instance;
    }

    // TODO: implementacia
    public boolean addPersonByFields(String name, int age) {
        return people.add(new Person(name, age));}
    public boolean editPersonByFields(String name, int age)
     {return false;}
    public boolean addPersonByObject(Person p) {
        return people.add(p);}
    public boolean editPersonByObject(Person p) {return false;}
    public Person getPersonByName(String name) {
        List<Person> names = new ArrayList<>();
        for (Person p : people) {
            if (p.getName().equalsIgnoreCase(name)) {
                people.contains(name);
                names.add(p);
            }
        }
        System.out.println(names);
        return null;

    }



    public List<Person> getPeopleByAgeMoreThan(int age) {
        List<Person> ages = new ArrayList<>();
        for (Person p : people) {
            if (p.getAge() > age) {
                ages.add(p);
            }

        }
        System.out.println(people.toString());

        return ages;
    }
    public void removePersonByName(String name) {
        for(Person p : people) {
            if (p.getName().equalsIgnoreCase(name)) {
                people.remove(p);

            }
        }
    }
    public LinkedList<Person> getAllPeople() {
        for(int i =0; i < people.size();i++){
            System.out.println(people.get(i));
        }

        return null;
    }

    @Override
    public String toString() {
        return "PersonContainer{" +
                "people=" + people +
                '}';
    }
}
