package org14.example.filehandling.reader;

import java.io.*;
import java.util.Scanner;

public class TestforUnderstand {
    public static void main(String[] args) {
        try{
            File f=new File("TestUnderstand.txt");
            f.createNewFile();

            FileWriter f2=new FileWriter(f);
//            f2.write("Hello I am Java language");
//            f2.close();
            PrintWriter p=new PrintWriter(f2);
            p.println("hello");
            p.close();

//            FileReader f3=new FileReader(f);
//            int i=0;
//            while((i=f3.read())!=-1){
//                System.out.print((char)i);
//            }
//            f3.close();

            Scanner s= new Scanner(f);
            while(s.hasNextLine()){
                String l=s.nextLine();
                System.out.println(l);
            }

        }catch(IOException e){
            System.out.println(e);
        }


    }
}
