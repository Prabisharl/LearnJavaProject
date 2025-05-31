package org14.example.filehandling.reader;
import java.io.FileReader;
public class ReadFileByFileReader {
    public static void main(String[] args) {
        char[] dataReadInFile=new char[50];

        try{
           FileReader fr=new FileReader("P:/GitRepo/LearnJavaProject/files/file1.txt");
           fr.read(dataReadInFile);
            System.out.println(dataReadInFile);
           fr.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(dataReadInFile);// can able to print outside try block but not outside method
    }
}
