package org14.example.filehandling.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
    public static void main(String[] args) {
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("P:/GitRepo/LearnJavaProject/files/f.txt"));
            Student obj=(Student) ois.readObject();
        }catch(IOException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }
}
