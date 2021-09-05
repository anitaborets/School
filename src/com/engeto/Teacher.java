package com.engeto;

public class Teacher extends Person implements Print {

    public Teacher (String name, String secondName){
        super(name, secondName);

    }

    @Override
    public void print(){
        System.out.println("A toto je override metoda");
    }



}
