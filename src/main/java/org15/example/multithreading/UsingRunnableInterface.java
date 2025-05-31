package org15.example.multithreading;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;
//There is no need to subclass a Thread when a task can be done by overriding only the run() method of Runnable.

public class UsingRunnableInterface {
    private class A implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "executing run() method!");

            try {

                File f = new File("C:\\temp\\a.xml");
                //             boolean s=f.canRead();
//                Files.readAllLines(f.toPath());
//              //  Scanner scanner = new Scanner(f);
//            }catch(FileNotFoundException e){
//                e.printStackTrace();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            int r=1/0;
//            throw new NullPointerException();
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
       Thread t1=new Thread(new UsingRunnableInterface().new A()); 	// Create a Thread
       t1.start();// Running the Thread
    }
}
