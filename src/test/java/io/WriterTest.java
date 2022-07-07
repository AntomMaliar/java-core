package io;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTest {
    @Test
    public void createWriter() throws IOException {
        Writer writer = new FileWriter("C:\\Users\\fuckyou\\Desktop\\Intelige IDEA work space\\Java-Core\\src\\test\\java\\io\\IOtestFile.txt");
        String mySting = "hello world";
        writer.write(mySting);
        writer.flush();
    }
}
