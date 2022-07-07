package io;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamTest {
    @Test
    public void bufferedInputStreamTest() throws IOException {
        FileInputStream fileStream = new FileInputStream("C:\\Users\\fuckyou\\Desktop\\Intelige IDEA work space\\Java-Core\\src\\test\\java\\io\\IOtestFile.txt");
        BufferedInputStream buffer = new BufferedInputStream(fileStream);

        int i;
        while ((i=buffer.read()) != -1){
            System.out.print((char) i);
        }

        fileStream.close();
        buffer.close();
    }
}
