package com.cc.java;

public class Cat {
    
    // Eigenschaften / properties
    // Felder / fields / attributes

    // pass by reference
    String name = "Grisabella";
    String  furColor = "white";

    // pass by value
    int age = 29;

    // Rückgabetyp -- Cat
    public Cat getInstanceVariable(){
        return this;
    }

}
