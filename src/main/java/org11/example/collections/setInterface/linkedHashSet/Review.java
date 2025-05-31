package org11.example.collections.setInterface.linkedHashSet;

import java.util.InputMismatchException;
import java.util.Scanner;
class ExceptionHandler extends Exception{
    public ExceptionHandler(String str){
        super(str);
    }
}

public class Review{
    public static void main(String[] args) {
        try{
            throw new ExceptionHandler("This is custom exception");
        }
        catch(ExceptionHandler e){
            System.out.println(e);
        }
    }
}