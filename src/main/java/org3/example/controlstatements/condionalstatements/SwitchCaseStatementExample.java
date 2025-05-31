package org3.example.controlstatements.condionalstatements;

//switch-case is best for checking equality conditions with multiple values.

import java.util.Scanner;

public class SwitchCaseStatementExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter first number:");
        int a=sc.nextInt();

        System.out.println("Enter second number:");
        int b=sc.nextInt();

        System.out.println("Choose an operation:+,-,*,/");
        char operator=sc.next().charAt(0);

        switch(operator){
            case '+':
                System.out.println("Sum ="+ (a+b));
                break;

            case '-':
                System.out.println("Difference=" + (a-b));
                break;

            case '*':
                    System.out.println("Multiplication =" + (a*b));
                    break;
            case '/':
                if(b!=0)
                    System.out.println("Division="+ (a+b));
                else
                    System.out.println("Cannot divide by zero");
                break;

            default:
                System.out.println("Invalid operator");
        }

    }
}
