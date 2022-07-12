package serialization;

import org.junit.Test;

import java.io.*;

public class SerializationTest {
    @Test
    public void exampleOfSerialization() throws IOException {
        Student student = new Student(1, "Jon");
        FileOutputStream fileOutputStream = new FileOutputStream("src/test/java/serialization/out.txt");
        ObjectOutputStream objectOutputStream  = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
        objectOutputStream.flush();
        objectOutputStream.close();
    }
    @Test
    public void exampleOfDeserialization() throws IOException, ClassNotFoundException {
        FileInputStream readFile = new FileInputStream("src/test/java/serialization/out.txt");
        ObjectInputStream readObject = new ObjectInputStream(readFile);

        Student student = (Student) readObject.readObject();
        System.out.println(student.id);
        System.out.println(student.name);

        readObject.close();
        readFile.close();
    }
    @Test
    public void serializationWithInheritance() throws IOException, ClassNotFoundException {
        Child child = new Child("some name Parent","some name Child");
        //serialize
        FileOutputStream fileOutputStream = new FileOutputStream("src/test/java/serialization/out.txt");
        ObjectOutputStream objectOutputStream  = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(child);
        objectOutputStream.flush();
        objectOutputStream.close();
        //deserialize
        FileInputStream readFile = new FileInputStream("src/test/java/serialization/out.txt");
        ObjectInputStream readObject = new ObjectInputStream(readFile);

        Child child1 = (Child) readObject.readObject();
        System.out.println(child1.nameParent);
        System.out.println(child1.nameChild);

        readObject.close();
        readFile.close();
    }
}
