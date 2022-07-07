package io;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamTest {
    @Test
    public void writeDataInto2Files() throws IOException {
        String s = "Hello World";
        byte[] myString = s.getBytes();

        ByteArrayOutputStream arrayOutput = new ByteArrayOutputStream();
        arrayOutput.writeBytes(myString);

        FileOutputStream stream1 = new FileOutputStream("C:\\Users\\fuckyou\\Desktop\\Intelige IDEA work space\\Java-Core\\src\\test\\java\\io\\f1.txt");
        FileOutputStream stream2 = new FileOutputStream("C:\\Users\\fuckyou\\Desktop\\Intelige IDEA work space\\Java-Core\\src\\test\\java\\io\\f2.txt");

        arrayOutput.writeTo(stream1);
        arrayOutput.writeTo(stream2);


        arrayOutput.close();
        stream1.close();
        stream2.close();
    }
}
