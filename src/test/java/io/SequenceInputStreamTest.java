package io;

import org.junit.Test;

import java.io.*;

public class SequenceInputStreamTest {
    @Test
    public void sequenceInputStreamTest() throws IOException {
        FileInputStream stream1 = new FileInputStream("C:\\Users\\fuckyou\\Desktop\\Intelige IDEA work space\\Java-Core\\src\\test\\java\\io\\IOtestFile.txt");
        FileInputStream stream2 = new FileInputStream("C:\\Users\\fuckyou\\Desktop\\Intelige IDEA work space\\Java-Core\\src\\test\\java\\io\\IOtestFile.txt");

        SequenceInputStream sequenceInputStream = new SequenceInputStream(stream1,stream2);

        int i;
        while ((i=sequenceInputStream.read()) != -1){
            System.out.print((char) i);
        }

        stream1.close();
        stream2.close();
        sequenceInputStream.close();
    }
}
