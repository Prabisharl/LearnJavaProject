package org14.example.filehandling.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileByBufferedWriter {
    public static void main(String[] args) {
        try{
           BufferedWriter e=new BufferedWriter(new FileWriter("P:/GitRepo/LearnJavaProject/files/file1.txt"));
           e.write("Hello, this is a test message1 writing using  BufferedWriter.");
           e.newLine();
           e.write("Hello, this is a test message2 writing using  BufferedWriter.");
            e.close();
            System.out.println("success writing");
        }catch(IOException e){
            System.out.println("Error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
