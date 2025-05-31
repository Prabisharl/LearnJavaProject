package org5.example.methods;

public class Palindrome {
    void checkPalindrome(int num){
        int temp=num;
        int rev=0;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(temp==rev){
            System.out.println(temp+" is Palindrome");
        }else{
            System.out.println(temp+" is not Palindrome");
        }
    }

    public static void main(String[] args) {
        Palindrome obj=new Palindrome();
        obj.checkPalindrome(121);
        obj.checkPalindrome(123);
    }
}
