package org17.example.locks;
//They ensure that only one thread can execute a synchronized block/method of a class at a time, across all instances of the class.
class Printer{
    public static void print(String empName,String docName){
        System.out.println("Printing here is available");
         synchronized(Printer.class){
             System.out.println(empName+" is printing "+docName);
             try{
                 Thread.sleep(3200);
             }catch(InterruptedException e){
                 System.out.println(e);
             }
             System.out.println(docName+" is finished");

        }
    }
}
class EmployeeThread extends Thread{
    String empName;
    String docName;

    EmployeeThread(String empName,String docName){
        this.empName=empName;
        this.docName=docName;
    }

    @Override
    public void run(){
        Printer.print(empName,docName);
    }
}
public class StaticSynchronizedorClassLevel {
    public static void main(String[] args) {
       EmployeeThread t1=new EmployeeThread("Radhu","doc1");
       t1.start();
        EmployeeThread t2=new EmployeeThread("Madhu","doc2");
        t2.start();
    }
}
