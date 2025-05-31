package org14.example.filehandling.create;
import java.io.File;
import java.io.IOException;

public class CreateFileDemo {
    public static void main(String[] args) {
        //created file in this current directory in f1 object
        File f1=new File("Samplefile1.txt");//it simply represents a representation of file or path.So there is no need to handle exception at this point.

        try{
            boolean status=f1.createNewFile();
            if(status){
                System.out.println("File created");
            }else{
                System.out.println("file already exists");
            }
        }catch(IOException e){
            System.out.println("Error occured");
        }




        //created file in separate folder with another object f2
        File f2=new File("\\P:\\GitRepo\\LearnJavaProject\\files\\file1.txt");

        try{
            boolean status=f2.createNewFile();
            if(status){
                System.out.println("File created");
            }else{
                System.out.println("file already exists");
            }
        }catch(IOException e){
            System.out.println("Error occured");//any error in file path
        }
    }
}
