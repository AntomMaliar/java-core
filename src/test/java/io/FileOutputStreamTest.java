package io;

import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    FileOutputStream stream;
    @Before
    public void createStrem() throws FileNotFoundException {
        stream = new FileOutputStream("C:\\Users\\fuckyou\\Desktop\\Intelige IDEA work space\\Java-Core\\src\\test\\java\\io\\IOtestFile.txt");
    }

    @Test
    public void writeByte() throws IOException {
        stream.write(65);
        stream.close();
    }
    @Test
    public void writeString() throws IOException {
        String s = "Hello World";
        byte[] myString = s.getBytes();
        stream.write(myString);
        stream.close();
    }
}
