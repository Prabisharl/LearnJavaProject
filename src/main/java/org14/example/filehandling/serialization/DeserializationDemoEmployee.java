package org14.example.filehandling.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemoEmployee {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream f=new FileInputStream("P:/GitRepo/LearnJavaProject/files/codedecode.ser");
        ObjectInputStream o=new ObjectInputStream(f);
        Employee emp=(Employee) o.readObject();
        System.out.println(emp.getName());
        o.close();
        f.close();




        
    }
}
