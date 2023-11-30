/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.util.EventObject;

/**
 *
 * @author a21gonzalocm
 */
public class StringEvent extends EventObject {

    private String name;
    private String occupation;
    private int id;
    private String employment;
    private String taxID;
    private String gender;
    private boolean checkUS;

    public boolean isCheckUS() {
        return checkUS;
    }

    public void setCheckUS(boolean checkUS) {
        this.checkUS = checkUS;
    }

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }

    public String getTaxID() {
        return taxID;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public StringEvent(Object source) {
        super(source);
    }

    public StringEvent(Object source, String name, String occupation, int id, String employment, Boolean checkUS, String taxID, String gender) {
        super(source);
        this.name = name;
        this.occupation = occupation;
        this.id = id;
        this.employment = employment;
        this.taxID = taxID;
        this.gender = gender;
        this.checkUS = checkUS;
    }

    public StringEvent(Object source, String name) {
        super(source);
        this.name = name;
    }

}
