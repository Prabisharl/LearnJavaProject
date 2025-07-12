package org14.example.filehandling.serialization;

import java.io.*;

public class ExternalizationDemoEmployee2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //initialization of employee class
        Employee2 emp2=new Employee2();
        emp2.setId(2);
        emp2.setName("Ragin");
        emp2.setPassword(258796);
        //Serialization for externalization
        FileOutputStream f=new FileOutputStream("P:\\GitRepo\\LearnJavaProject\\files\\Codedecode2.ser");
        ObjectOutputStream o=new ObjectOutputStream(f);
        o.writeObject(emp2);
        System.out.println("Done1");
        //deserialization from externalization
        FileInputStream fI=new FileInputStream("P:\\GitRepo\\LearnJavaProject\\files\\Codedecode2.ser");
        ObjectInputStream oI=new ObjectInputStream(fI);
        Employee2 emp3=(Employee2) oI.readObject();
        System.out.println("Done2");
        System.out.println(emp3.getId());
        System.out.println(emp3.getPassword());

    }
}
