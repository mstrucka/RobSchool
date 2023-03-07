import container.PersonContainer;
import model.Person;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        List<String> names = new ArrayList<String>();
        names.add("Robike");
        names.add("Marek");
        names.add("Juri");
        names.add("Misko");
        names.add("Martin");
        names.add("Sepetlak");
        names.add("Patres");

        List<Integer> ages = new ArrayList<Integer>();
        ages.add(24);
        ages.add(26);
        ages.add(28);
        ages.add(29);
        ages.add(30);
        ages.add(22);
        ages.add(33);

        ArrayList<Person> people = new ArrayList<Person>();

//
//        for (int i = 0; i < 7; i++) {
//            people.add(new Person(names.get(i), ages.get(i)));
//            String list = people.toString();
//            System.out.println("Person" + list);
//
//        }
//        PersonContainer.getInstance().addPersonByObject(p);
//        System.out.println(PersonContainer.getInstance().getAllPeople());



        List<Person> PersonContainer = new ArrayList<Person>(names.size());
//        Person p = new Person("Robike", 24);

        System.out.println(PersonContainer);

        Random generate = new Random();



//        PersonContainer.size()

        for (int i = 0; i < 7; i++) {
            PersonContainer.add(new Person(names.get(generate.nextInt(names.size())), ages.get(generate.nextInt(ages.size()))));
            }
        System.out.println(PersonContainer.toString());
//        for(Person p :PersonContainer){
//            System.out.println(p.toString());
        }
        }


//
//                for(Person p :PersonContainer){
//                System.out.println(p.toString());
//            Person p = new Person(names.get(generate.nextInt()), 24);
//            PersonContainer.addPersonByFields(names.get(generate.nextInt(i)), ages.get(generate.nextInt(i)));
//
//            System.out.println("Here is a person with" + p. "whose age is " + age);



    // TODO: všetko toto píšeme sem do mainu
    //  1 list mien, aspoň 10 vecí hardcoded, takisto list čísel čo bude vek, 10 RANDOM čísel v ňom
    //  2 for loop ktorý vytvorí 10 Persons, s tým že to meno a vek zoberie randomne z tých listov
    //  3 vypísať AllPeople, bude treba asi toString
//        //  4 vyskúšať všetky metódy z Containera či fungujú tu v maine, štýlom že:
//        System.out.println("menim robikemu meno na sepetlak, robike pred zmenou: " + PersonContainer.getInstance().getPersonByName("robike"));
//        p.setName("sepetlak");
//        PersonContainer.getInstance().editPersonByObject(p);
//        System.out.println("Robike po zmene: " + PersonContainer.getInstance().getPersonByName("sepetlak"));
    // TODO: keď budeš chápať ako funguje toto s Person a všetko ti pôjde, spravíš to isté so School ideálne bez pozerania do kódu
    // TODO: a sám si tú School navrhneš aké metódy budú v tom kontajneri, ako si vytvoríš tú school, etc. precvičuj for, random, iterovanie listom

    // BONUS: list bude len abeceda a to meno pre person/školu poskladáš z 5-8 písmen

//    }

