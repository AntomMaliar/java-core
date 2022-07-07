package io;

import org.junit.Test;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {
    @Test
    public void bufferedOutputStreamtest() throws IOException {
        FileOutputStream fileStream = new FileOutputStream("C:\\Users\\fuckyou\\Desktop\\Intelige IDEA work space\\Java-Core\\src\\test\\java\\io\\IOtestFile.txt");
        BufferedOutputStream buffer = new BufferedOutputStream(fileStream);

        String myString  = "buffered output stream test";
        byte[] myData = myString.getBytes();

        buffer.write(myData);
        buffer.flush();

        fileStream.close();
        buffer.close();


    }
}
