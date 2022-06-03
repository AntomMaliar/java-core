package programs.basic;

import org.junit.Test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class RandomNumber {
    @Test
    public void usingMathRandom(){
        System.out.println("random number = " + Math.random());
    }
    @Test
    public void randomNumberBetweenSpecifiedRange(){
        int min = 100;
        int max = 150;

        double a = Math.random()*(max-min+1)+min;
        System.out.println(a);

        double b = Math.random()*(max-min+1)+min;
        System.out.println((int)b);
    }
    @Test
    public void usingRandomClass(){
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(15));
        System.out.println(random.nextDouble());
        System.out.println(random.nextBoolean());
    }
    @Test
    public void usingThreadLocalRandomClass(){
        System.out.println(ThreadLocalRandom.current().nextInt());
        System.out.println(ThreadLocalRandom.current().nextInt(10));
        System.out.println(ThreadLocalRandom.current().nextDouble());
        System.out.println(ThreadLocalRandom.current().nextDouble(15));
    }
}
