package org14.example.filehandling.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadFileNIO {
    public static void main(String[] args) {
        File f = new File("P:/GitRepo/LearnJavaProject/files/file1.txt");
        File f2 = new File("P:/GitRepo/LearnJavaProject/files/file10.txt");//String format
        try {


            // Reading file using Files class
        Path p = f.toPath();//converting string format to Path class
            List<String> fileLines = Files.readAllLines(p);//Path class...string format chznged into class
            fileLines.forEach(System.out::println);

            Files.write(f2.toPath(), fileLines);
        } catch (FileNotFoundException e) {
            System.out.println("File not found so error occured");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
