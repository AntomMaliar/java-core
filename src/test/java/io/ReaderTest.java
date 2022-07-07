package io;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderTest {
    @Test
    public void createReader() {
        try {
            Reader reader = new FileReader("C:\\Users\\fuckyou\\Desktop\\Intelige IDEA work space\\Java-Core\\src\\test\\java\\io\\IOtestFile.txt");
            int data = reader.read();
            while (data != -1){
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        }catch (IOException exception){
            System.out.println(exception);
        }
    }
}
