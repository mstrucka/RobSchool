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
    // TODO: v??etko toto p????eme sem do mainu
    //  1 list mien, aspo?? 10 vec?? hardcoded, takisto list ????sel ??o bude vek, 10 RANDOM ????sel v ??om
    //  2 for loop ktor?? vytvor?? 10 Persons, s t??m ??e to meno a vek zoberie randomne z t??ch listov
    //  3 vyp??sa?? AllPeople, bude treba asi toString
    //  4 vysk????a?? v??etky met??dy z Containera ??i funguj?? tu v maine, ??t??lom ??e:
//

    // TODO: ke?? bude?? ch??pa?? ako funguje toto s Person a v??etko ti p??jde, sprav???? to ist?? so School ide??lne bez pozerania do k??du
    // TODO: a s??m si t?? School navrhne?? ak?? met??dy bud?? v tom kontajneri, ako si vytvor???? t?? school, etc. precvi??uj for, random, iterovanie listom

    // BONUS: list bude len abeceda a to meno pre person/??kolu posklad???? z 5-8 p??smen


