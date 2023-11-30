package org.example.Controller;

import org.example.Model.*;
import org.example.Model.Database;
import org.example.Vista.FormEvent;

public class Controller implements IController {
    // Garda unha referencia á base de datos
    private Database db = new Database();

    @Override
    public void addPerson(FormEvent ev) {
        // Recuperar toda a información do obxecto ev
        String name = ev.getName();
        String occupation = ev.getOccupation();
        int ageCatId = ev.getAgeCategory();
        String empCat = ev.getEmpCategory();
        String taxId = ev.getTaxId();
        Boolean usCit = ev.getUsCitizen();
        String gen = ev.getGender();

        AgeCat ageCategory = switch (ageCatId) {
            case 0 -> AgeCat.CHILD;
            case 1 -> AgeCat.ADULT;
            case 3 -> AgeCat.SENIOR;
            default -> null;
        };

        EmploymentCategory empCategory;
        if (empCat.equals("employed")) {
            empCategory = EmploymentCategory.EMPLOYED;
        } else if (empCat.equals("self-employed")) {
            empCategory = EmploymentCategory.SELFEMPLOYED;
        } else {
            empCategory = EmploymentCategory.UNEMPLOYED;
        }

        Gender gender = switch (gen) {
            case "male" -> Gender.MALE;
            case "female" -> Gender.FEMALE;
            default -> throw new IllegalStateException("Unexpected value: " + gen);
        };

        Person person = new Person(name, occupation, ageCategory, empCategory,
                taxId, usCit, gender);
        db.addPerson(person);
    }

    @Override
    public Person sendPerson(Person person) {
        return null;
    }
}
