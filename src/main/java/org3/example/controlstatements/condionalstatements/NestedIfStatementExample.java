package org3.example.controlstatements.condionalstatements;

//Nested if is placing an if inside another if.

public class NestedIfStatementExample {

    public static void main(String[] args) {

        String nationality = "Indian";
        int age = 25;

        if (age >= 18) {
            if (nationality.equals("Indian")) {
                System.out.println("Eligible to vote");
            }else {
                System.out.println("Not eligible to vote");
            }
        }else{
            System.out.println("Your age is not eligible to vote");
        }
    }
}