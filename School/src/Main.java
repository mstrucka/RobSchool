//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import container.PersonContainer;
import controller.PersonController;
import model.Person;

public class Main {
    public Main() {

    }

    public static void main(String[] args) {
        PersonController controller = new PersonController();
        List<String> names = new ArrayList();
        names.add("Robike");
        names.add("Marek");
        names.add("Juri");
        names.add("Misko");
        names.add("Martin");
        names.add("Sepetlak");
        names.add("Patres");

        List<Integer> ages = new ArrayList();

        ages.add(24);
        ages.add(26);
        ages.add(28);
        ages.add(29);
        ages.add(30);
        ages.add(22);
        ages.add(33);

        Random generate = new Random();

        for (int i = 0; i < names.size(); ++i) {
            PersonContainer.getInstance().addPersonByObject(new Person((String) names.get(generate.nextInt(names.size())), (Integer) ages.get(generate.nextInt(ages.size()))));

        }


//        Person p = new Person("Marco", 22);
//        PersonContainer.getInstance().addPersonByFields("Marco",11);

        System.out.println(PersonContainer.getInstance().toString());
        controller.getAllPeople();
        controller.getPeopleByAgeMoreThan(22);
        controller.getPersonByName("Marek");

//        Collections.shuffle(PersonContainer);
//        PersonContainer.getInstance().removePersonByName("Robike");
//        System.out.println(PersonContainer.getInstance().toString());

//        PersonContainer.getInstance().getPeopleByAgeMoreThan(26);
////        PersonContainer.getInstance().getPersonByName("Marek");
//        PersonContainer.getInstance().getAllPeople();

    }




}



//    Person p = new Person("robike", 24);
//        PersonContainer.getInstance().addPersonByObject(p);
//        System.out.println(PersonContainer.getInstance().getAllPeople());
    // TODO: všetko toto píšeme sem do mainu
    //  1 list mien, aspoň 10 vecí hardcoded, takisto list čísel čo bude vek, 10 RANDOM čísel v ňom
    //  2 for loop ktorý vytvorí 10 Persons, s tým že to meno a vek zoberie randomne z tých listov
    //  3 vypísať AllPeople, bude treba asi toString
    //  4 vyskúšať všetky metódy z Containera či fungujú tu v maine, štýlom že:
//

    // TODO: keď budeš chápať ako funguje toto s Person a všetko ti pôjde, spravíš to isté so School ideálne bez pozerania do kódu
    // TODO: a sám si tú School navrhneš aké metódy budú v tom kontajneri, ako si vytvoríš tú school, etc. precvičuj for, random, iterovanie listom

    // BONUS: list bude len abeceda a to meno pre person/školu poskladáš z 5-8 písmen


