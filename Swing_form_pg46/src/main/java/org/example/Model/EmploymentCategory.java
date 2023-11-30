package org.example.Model;

public enum EmploymentCategory {
    EMPLOYED("employed"), SELFEMPLOYED("self-employed"), UNEMPLOYED("unemployed"), OTHER("other");
    final String name;

    EmploymentCategory(String name) {
        this.name = name;
    }
}
