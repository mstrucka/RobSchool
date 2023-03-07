import container.PersonContainer;
import model.Person;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("robike", 24);
        PersonContainer.getInstance().addPersonByObject(p);
        System.out.println(PersonContainer.getInstance().getAllPeople());
        // TODO: všetko toto píšeme sem do mainu
        //  1 list mien, aspoň 10 vecí hardcoded, takisto list čísel čo bude vek, 10 RANDOM čísel v ňom
        //  2 for loop ktorý vytvorí 10 Persons, s tým že to meno a vek zoberie randomne z tých listov
        //  3 vypísať AllPeople, bude treba asi toString
        //  4 vyskúšať všetky metódy z Containera či fungujú tu v maine, štýlom že:
        System.out.println("menim robikemu meno na sepetlak, robike pred zmenou: " + PersonContainer.getInstance().getPersonByName("robike"));
        p.setName("sepetlak");
        PersonContainer.getInstance().editPersonByObject(p);
        System.out.println("Robike po zmene: " + PersonContainer.getInstance().getPersonByName("sepetlak"));
        // TODO: keď budeš chápať ako funguje toto s Person a všetko ti pôjde, spravíš to isté so School ideálne bez pozerania do kódu
        // TODO: a sám si tú School navrhneš aké metódy budú v tom kontajneri, ako si vytvoríš tú school, etc. precvičuj for, random, iterovanie listom

        // BONUS: list bude len abeceda a to meno pre person/školu poskladáš z 5-8 písmen

    }
}