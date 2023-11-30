package org.example.Model;

public class Person {

    private static int count = 0;
    private int id;
    private String name;
    private String occupation;
    private AgeCat ageCategory;
    private EmploymentCategory empCategory;
    private String taxId;
    private Boolean usCitizen;
    private Gender gender;

    public Person(String name, String occupation, AgeCat ageCategory, EmploymentCategory empCategory, String taxId, Boolean usCitizen, Gender gender) {
        id = count++;
        this.name = name;
        this.occupation = occupation;
        this.ageCategory = ageCategory;
        this.empCategory = empCategory;
        this.taxId = taxId;
        this.usCitizen = usCitizen;
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

    public AgeCat getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(AgeCat ageCategory) {
        this.ageCategory = ageCategory;
    }

    public EmploymentCategory getEmpCategory() {
        return empCategory;
    }

    public void setEmpCategory(EmploymentCategory empCategory) {
        this.empCategory = empCategory;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public Boolean getUsCitizen() {
        return usCitizen;
    }

    public void setUsCitizen(Boolean usCitizen) {
        this.usCitizen = usCitizen;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
