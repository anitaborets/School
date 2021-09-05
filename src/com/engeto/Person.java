package com.engeto;

public abstract class Person {
    String name;
    String secondName;

    public Person(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    String name(){
        return name;
    }
    String secondName(){
        return secondName;


    }
}
