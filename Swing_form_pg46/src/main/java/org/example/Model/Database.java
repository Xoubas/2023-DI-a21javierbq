package org.example.Model;

import java.util.Collections;
import java.util.LinkedList;

public class Database {
    private LinkedList<Person> people;

    public Database() {
        people = new LinkedList<Person>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public LinkedList<Person> getPeople() {
// Para evitar que se modifique a lista devolta
        return (LinkedList<Person>) Collections.unmodifiableList(people);
    }
}
