package org14.example.filehandling.methodsOfFile;

import java.io.File;
import java.io.IOException;

public class FilehandlingDemo {
    public static void main(String[] args) throws IOException {
        File obj=new File("/org14/example/filehandling/myfile2.txt");
        System.out.println(obj.exists());
        if (obj.createNewFile()) {
            System.out.println("File created: " + obj.getName());
            System.out.println(obj.exists());
        } else {
            System.out.println("File already exists.");
        }





        File obj3=new File("com.project.filehandling2");
        String packagename="comm.project.filehandling2";
        boolean success=obj3.mkdir();
        if (success) {
            File obj4=new File("myfile1.txt");
            System.out.println(obj4.exists());
            if (obj4.createNewFile()) {
                System.out.println("File created: " + obj4.getName());
                System.out.println(obj3.exists());
            } else {
                System.out.println("File already exists.");
            }
            System.out.println("Folder created: " + obj3.getName());
        }else{
            System.out.println("Folder already exists."+obj3.getName());
        }

    }
}
