package com.engeto;

public class Student extends Person implements Print{
    Integer yearOfBirth;
    String id;

    public Student(String name, String secondName, Integer yearOfBirth, String id){
        super(name,secondName);
        this.yearOfBirth = yearOfBirth;
        this.id = id;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return " " + id + " " + name  + " " + secondName;
    }

}
