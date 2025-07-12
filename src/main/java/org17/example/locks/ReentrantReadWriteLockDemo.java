package org17.example.locks;
//ReentrantReadWriteLock class implements the ReadWriteLock interface.

//✅ Multiple readers at the same time (if no writer is active)

//❌ Only one writer at a time (and no readers allowed while writing)

import java.util.concurrent.locks.ReentrantReadWriteLock;

class Book{
    private String content="Initial content";

    private final ReentrantReadWriteLock lock=new ReentrantReadWriteLock();
    public void readBook(String readerName){
        lock.readLock().lock();// Acquire read lock
        try{
            System.out.println(readerName+" is reading now");
            Thread.sleep(200);
        }catch(InterruptedException e){
            e.printStackTrace();
        }finally{
            lock.readLock().unlock();
        }
    }

    public void writeBook(String writerName,String newContent){
        lock.writeLock().lock();
        try{
            System.out.println(writerName+" is wriring now");
            Thread.sleep(2000);
            this.content=newContent;
//            newContent="Hello he she";
            System.out.println("Updated content");
        }catch(InterruptedException e){
            e.printStackTrace();
        }finally{
            lock.writeLock().unlock();
        }
    }
}
public class ReentrantReadWriteLockDemo {
    public static void main(String[] args) {
        Book b=new Book();

        // Readers
        Runnable r1=()->{
            b.readBook("Reader2");
        };
        Thread t1=new Thread(r1,"Reader1");
        t1.start();

        // Writer
        Thread writer=new Thread(()-> {
            b.writeBook("Writer1", "Updated content");
        });
        writer.start();

    }
}
