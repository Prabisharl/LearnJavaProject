package org14.example.filehandling.writer;
import java.io.FileWriter;
public class WriteFileByFileWriter {
    public static void main(String[] args) {
        String dataInFile ="This is a test file for writing something to a already created file";
        String dataInFile2 ="This is second line of the file";
        String dataInFile3 ="This is third line of the file";



        try{
            FileWriter fw=new FileWriter("P:/GitRepo/LearnJavaProject/files/file1.txt");//filewriter create io exception so write it always inside try blpck
            fw.write(dataInFile+"\n");//Each \n creates a new line in the file
            fw.write(dataInFile2+"\n");
            fw.write(dataInFile3);
            fw.close();
        }catch(Exception e){
           e.printStackTrace();
        }
    }
}
