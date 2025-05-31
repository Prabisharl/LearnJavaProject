package org14.example.filehandling.reader;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ReadWordbyWordByScanner {
    public static void main(String[] args) {
        try{
           File f=new File("P:/GitRepo/LearnJavaProject/files/file1.txt");
           Scanner sc=new Scanner(f);
           while(sc.hasNext()){
               String words=sc.next();
               System.out.println(words);
           }
           sc.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
