package org14.example.filehandling.reader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadLinebyLineUsingScanner {
    public static void main(String[] args) {
        String line=new String();
        File f=new File("P:/GitRepo/LearnJavaProject/files/file1.txt");
        try{

            Scanner sc=new Scanner(f);
            while(sc.hasNextLine()){
                 line=sc.nextLine();
                System.out.println(line);
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found so error occured");
        }
        System.out.println(line);
    }
}
