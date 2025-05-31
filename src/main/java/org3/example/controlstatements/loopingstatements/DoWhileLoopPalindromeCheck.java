package org3.example.controlstatements.loopingstatements;

import java.util.Scanner;

public class DoWhileLoopPalindromeCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter a number");
        int num=sc.nextInt();

        int temp = num;  // Store original number
        int rev = 0;     // Variable to store reverse

        do {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        while(temp != 0);


        if(temp == rev) {
            System.out.println(temp + " is a Palindrome Number");
        } else {
            System.out.println(temp + " is Not a Palindrome Number");
        }

    }
}
/*1st Iteration:
rem = num % 10 = 121 % 10 = 1

rev = rev * 10 + rem = 0 * 10 + 1 = 1

num = num / 10 = 121 / 10 = 12

2nd Iteration:
rem = num % 10 = 12 % 10 = 2

rev = rev * 10 + rem = 1 * 10 + 2 = 12

num = num / 10 = 12 / 10 = 1

3rd Iteration:
rem = num % 10 = 1 % 10 = 1

rev = rev * 10 + rem = 12 * 10 + 1 = 121

num = num / 10 = 1 / 10 = 0

 */
