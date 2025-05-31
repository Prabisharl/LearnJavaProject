package org5.example.methods;

public class Factorial {
    int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        System.out.println("factorial is" +obj.factorial(5));
    }
}
