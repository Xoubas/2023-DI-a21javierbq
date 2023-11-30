package org.example.Model;

public enum Gender {
    MALE('M'), FEMALE('F');
    private final char gender;

    Gender(char gender) {
        this.gender = gender;
    }
}
