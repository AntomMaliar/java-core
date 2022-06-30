package io;

import org.junit.Before;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    FileInputStream stream;
    @Before
    public void createStream() throws FileNotFoundException {
        stream = new FileInputStream("C:\\Users\\fuckyou\\Desktop\\Intelige IDEA work space\\Java-Core\\src\\test\\java\\io\\IOtestFile.txt");
    }
    @Test
    public void  readSingleCharacter() throws IOException {
        int character = stream.read();
        System.out.print((char)character);
        stream.close();
    }
    @Test
    public void readAllCharacters() throws IOException {
        int i;
        while ((i = stream.read()) != -1){
            System.out.print((char) i);
        }
        stream.close();
    }
}
