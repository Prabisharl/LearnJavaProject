package org8.example.inheritance;

class Animal {

    void sound() {
        System.out.println("Some sounds from animals");
    }
}

public class CatMethodOverriding extends Animal {

    void sound() {
        System.out.println("Meow");
    }

    public static void main(String[] args) {
        CatMethodOverriding a = new CatMethodOverriding();
        a.sound(); // Overridden method
    }
}



