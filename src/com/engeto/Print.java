package com.engeto;

public interface Print {
    default void print(){
        System.out.println("Toto je default metoda");
    }
}
