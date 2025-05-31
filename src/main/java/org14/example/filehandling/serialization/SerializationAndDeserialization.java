package org14.example.filehandling.serialization;

import java.io.*;

class Demo implements Serializable {
    int a;
    String b;

    public Demo(int a, String b){
        this.a=a;
        this.b=b;
    }
}
public class SerializationAndDeserialization {
    public static void main(String[] args) {
        Demo obj=new Demo(1,"hello");

        try{
            FileOutputStream f=new FileOutputStream("P:/GitRepo/LearnJavaProject/files/serializationdemo2.txt");
            ObjectOutputStream o=new ObjectOutputStream(f);
            o.writeObject(obj);
            o.close();
            f.close();
        }catch(IOException e){
            System.out.println(e);
        }

        Demo obj2=null;
        try{
            FileInputStream f=new FileInputStream("P:/GitRepo/LearnJavaProject/files/serializationdemo2.txt");
            ObjectInputStream o=new ObjectInputStream(f);
             obj2=(Demo)o.readObject();
        }catch (IOException e){
            System.out.println("IOException occurred during deserialization.");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException occurred: " + e.getMessage());
        }

    }
}
