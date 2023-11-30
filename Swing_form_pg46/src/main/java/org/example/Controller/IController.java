package org.example.Controller;

import org.example.Model.Person;
import org.example.Vista.FormEvent;

public interface IController {
public void addPerson(FormEvent event);
public Person sendPerson(Person person);
}
