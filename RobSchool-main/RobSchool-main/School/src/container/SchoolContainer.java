package container;

import model.School;

import java.util.LinkedList;
import java.util.List;

public class SchoolContainer {
    private static SchoolContainer instance;
    private final LinkedList<School> schools;

    private SchoolContainer() {
        schools = new LinkedList<>();
    }

    public static SchoolContainer getInstance() {
        if (instance == null) {
            instance = new SchoolContainer();
        }
        return instance;
    }
    // TODO: see PersonContainer, 5-10 methods
}
