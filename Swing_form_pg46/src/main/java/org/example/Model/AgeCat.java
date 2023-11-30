package org.example.Model;

public enum AgeCat {
    CHILD("child"), ADULT("adult"), SENIOR("senior");
    private final String ageCategory;

    AgeCat(String ageCategory) {
        this.ageCategory = ageCategory;
    }
}
