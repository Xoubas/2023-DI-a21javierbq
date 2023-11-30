/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import gui.FormEvent;
import model.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Controller implements IController {
    private Database db = new Database();

    @Override
    public List<Person> getPeople() {
        return db.getPeople();
    }

    @Override
    public void addPerson(FormEvent ev) {
// Recuperar toda a información do obxecto ev
        String name = ev.getName();
        String occupation = ev.getOccupation();
        String taxId = ev.getTaxID();
        String gen = ev.getGender();
        boolean isUs = ev.isCheckUS();
        int ageCatId = ev.getAgeCategory();
        String empCat = ev.getEmployment();
        AgeCategory ageCategory = null;
        switch (ageCatId) {
            case 0:
                ageCategory = AgeCategory.CHILD;
                break;
            case 1:
                ageCategory = AgeCategory.ADULT;
                break;
            case 2:
                ageCategory = AgeCategory.SENIOR;
                break;
        }
        EmploymentCategory empCategory;
        if (empCat.equals("employed")) {
            empCategory = EmploymentCategory.EMPLOYED;
        } else if (empCat.equals("self-employed")) {
            empCategory = EmploymentCategory.SELFEMPLOYED;
        } else if (empCat.equals("unemployed")) {
            empCategory = EmploymentCategory.UNEMPLOYED;
        } else {
            empCategory = EmploymentCategory.OTHER;
        }

        Gender genderCat;

        if (gen.equals("male")) {
            genderCat = Gender.MALE;
        } else {
            genderCat = Gender.FEMALE;
        }

        Person person = new Person(name, occupation, ageCategory, empCategory,
                taxId, isUs, genderCat);
        db.addPerson(person);
    }

    @Override
    public void saveToFile(File file) throws IOException {
        db.saveToFile(file);
    }

    @Override
    public void loadFromFile(File file) throws IOException {
        db.loadFromFile(file);
    }
}
