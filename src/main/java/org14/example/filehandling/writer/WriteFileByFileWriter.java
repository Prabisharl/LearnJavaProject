package org14.example.filehandling.writer;
import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

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

    public static class WriteToFileChannel {

        public static void main(String[] args) {
            try {
                // Open file in read-write mode
                RandomAccessFile file = new RandomAccessFile("file.txt", "rw");
                FileChannel channel = file.getChannel();

                // Allocate buffer and put data
                ByteBuffer buffer = ByteBuffer.allocate(64);
                buffer.put("Hello NIO".getBytes());

                // Flip buffer to prepare for writing
                buffer.flip();

                // Write buffer to channel (file)
                channel.write(buffer);

                // Close file (and channel)
                file.close();

                System.out.println("Data written to file.txt");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
