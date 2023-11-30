/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import model.*;
import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 *
 * @author a21gonzalocm
 */
public class PersonTableModel extends AbstractTableModel {

    private List<Person> personList;
    private String[] columnNames = {"ID", "Name", "Occupation", "Age Category",
        "Employment Category", "US Citizen", "Tax ID", "Gender"};

    public PersonTableModel() {
    }

    public void setData(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public int getRowCount() {
        return personList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int column) {

        Object result = switch (column) {

            case 0 ->
                personList.get(row).getId();
            case 1 ->
                personList.get(row).getName();
            case 2 ->
                personList.get(row).getOccupation();
            case 3 ->
                personList.get(row).getAgeCategory();
            case 4 ->
                personList.get(row).getEmpCat();
            case 5 ->
                personList.get(row).isUsCitizen();
            case 6 ->
                personList.get(row).getTaxId();
            case 7 ->
                personList.get(row).getGender();
            default ->
                throw new IndexOutOfBoundsException("La columna: " + column + " no existe");

        };

        return result;

    }

    @Override
    public String getColumnName(int column) {
        if (column < 0 || column >= getColumnCount()) {
            throw new ArrayIndexOutOfBoundsException(column);
        } else {
            return columnNames[column];
        }
    }

}
