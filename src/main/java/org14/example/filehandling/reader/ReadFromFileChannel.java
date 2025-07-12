package org14.example.filehandling.reader;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadFromFileChannel {

    public static void main(String[] args) {
        try {
            // Open file in read mode
            RandomAccessFile file = new RandomAccessFile("file.txt", "r");
            FileChannel channel = file.getChannel();

            // Allocate buffer
            ByteBuffer buffer = ByteBuffer.allocate(64);

            // Read data from file into buffer
            channel.read(buffer);

            // Flip buffer to prepare for reading
            buffer.flip();

            // Print each character
            System.out.print("File content: ");
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }

            // Close file
            file.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

