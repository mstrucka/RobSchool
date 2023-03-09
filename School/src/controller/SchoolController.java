package controller;

import container.PersonContainer;
import container.SchoolContainer;
import model.Person;
import model.School;

import java.util.LinkedList;

public class SchoolController {
    // TODO: see PersonController

    SchoolContainer schoolContainer = new SchoolContainer();

    public boolean addSchoolByFields(String name, Integer capacity, String address) {
        return SchoolContainer.getInstance().addSchoolByFields(name, capacity, address);
    }
    public boolean addSchoolByObject(School s) {
        return SchoolContainer.getInstance().addSchoolByObject(s);}

    public LinkedList<School> getAllSchools(){
        return SchoolContainer.getInstance().getAllSchools();
    }


}
