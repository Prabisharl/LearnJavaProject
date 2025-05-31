package org14.example.filehandling.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadEntireFileByBufferedReader {
    public static void main(String[] args) {
//
//
//             {                           //read()	Reads a single character
//                                         // ...write()-->write single character
//                                        //....newLine()-->breaks or separateline
//                                        //readLine()	Reads a line of text.
//            }
//
//


        try{
            BufferedReader r=new BufferedReader(new FileReader("P:/GitRepo/LearnJavaProject/files/file1.txt"));
            String line;
            while((line=r.readLine())!=null){
                System.out.println(line);
            }

        }catch(IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}

