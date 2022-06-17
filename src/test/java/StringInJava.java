import org.junit.Test;
import org.openjdk.jol.vm.VM;

public class StringInJava {
    @Test
    public void javaStringIsImmutable(){
        String word = "apple";
        System.out.println(word);
        System.out.println("The memory address is " + VM.current().addressOf(word));
        //***
        word = word.concat(" car");
        System.out.println(word);
        System.out.println("The memory address is " + VM.current().addressOf(word));

    }
    @Test
    public void stringPool(){
        // If the string already exists in the pool, a reference to the pooled instance is returned.
        String a = "car";
        String b = "car";
        System.out.println("The memory address a is " + VM.current().addressOf(a));
        System.out.println("The memory address b is " + VM.current().addressOf(b));
        //***
        String c = new String("apple");
        String d = new String("apple");
        System.out.println("The memory address c is " + VM.current().addressOf(c));
        System.out.println("The memory address d is " + VM.current().addressOf(d));

    }
    @Test
    public void stringCompare(){
        String a = "apple";
        String b = "apple";
        System.out.println("a and b equal = " + a.equals(b));
        System.out.println("The memory address a is " + VM.current().addressOf(a));
        System.out.println("The memory address b is " + VM.current().addressOf(b));
        //***
        String c = new String("car");
        String d = new String("car");
        System.out.println("c and d equal = " + c.equals(d));
        System.out.println("The memory address c is " + VM.current().addressOf(c));
        System.out.println("The memory address d is " + VM.current().addressOf(d));
        //***
        System.out.println("a and b have same references" + a == b);
        System.out.println("c and d have same references" + c == d);
    }
    @Test
    public void mutableStrings(){
        StringBuilder s1 = new StringBuilder("hello");
        long address1 = VM.current().addressOf(s1);
        System.out.println(s1);
        //***
        s1.append("world");
        long address2 = VM.current().addressOf(s1);
        System.out.println(s1);

        System.out.println("address s1 is equal s1 after change");
        System.out.println(address1 == address2);
    }
}
