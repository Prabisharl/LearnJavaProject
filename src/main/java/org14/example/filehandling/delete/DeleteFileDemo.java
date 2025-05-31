package org14.example.filehandling.delete;
import java.io.File;
public class DeleteFileDemo {
    public static void main(String[] args) {
        File f=new File("P:/GitRepo/LearnJavaProject/files/file1 - Copy.txt");
        f.delete();
    }
}
