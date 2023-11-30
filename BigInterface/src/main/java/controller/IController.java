package controller;

import gui.*;
import model.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface IController {
    public List<Person> getPeople();

    public void addPerson(FormEvent ev);

    public void saveToFile(File file) throws IOException;

    public void loadFromFile(File file) throws IOException;
}
