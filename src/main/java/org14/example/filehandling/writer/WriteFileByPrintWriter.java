package org14.example.filehandling.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFileByPrintWriter {
    public static void main(String[] args) {
        try{
            PrintWriter pw=new PrintWriter(new FileWriter("P:/GitRepo/LearnJavaProject/files/file1.txt"));
            pw.println("Writing firstline using PrintWriter");
            pw.println("Writing secondline using PrintWriter");
            System.out.println("success writing");
            pw.close();
        }catch(IOException e){
            System.out.println("Error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
