package org14.example.filehandling.serialization;

import java.io.*;

public class SerializationDemoStudent {
    public static void main(String[] args) {
        try {


            //create a student object
            Student s = new Student("Prabisha", 12);
            //creating a stream object
            FileOutputStream f = new FileOutputStream("P:/GitRepo/LearnJavaProject/files/f.txt");
            ObjectOutputStream o=new ObjectOutputStream(f);
            //write an object
            o.writeObject(s);
            System.out.println("success writing");
        } catch(FileNotFoundException e) {
            System.out.println(e);

        }catch(IOException e){
            System.out.println(e);
        }
    }
}
