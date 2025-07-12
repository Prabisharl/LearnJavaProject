package org14.example.filehandling.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemoEmployee {
    public static void main(String[] args) throws IOException {
        Employee e=new Employee();
        e.setId(101);
        e.setName("Prabisha");

        FileOutputStream  f=new FileOutputStream("P:/GitRepo/LearnJavaProject/files/codedecode.ser");
        ObjectOutputStream o=new ObjectOutputStream(f);
        o.writeObject(e);
        System.out.println("success writing");
        System.out.println(e.getName());

        o.close();
        f.close();
    }
}
