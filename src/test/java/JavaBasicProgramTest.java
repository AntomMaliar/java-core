import org.junit.Test;

import java.net.PortUnreachableException;

public class JavaBasicProgramTest {
    @Test
    public void fibonacciSeriesWithoutRecursion(){
        int n1 = 0;
        int n2 = 1;
        int n3;

        System.out.print(n1 + " " + n2);
        for (int i = 0; i < 10; i++){
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
    @Test
    public void fibonacciSeriesWithRecursion(){
        JavaBasicProgram.printFibonacci(10,0,1);
    }
    @Test
    public void checkPrimeNumber(){
        JavaBasicProgram.checkPrimeNumber(1);
        JavaBasicProgram.checkPrimeNumber(17);
        JavaBasicProgram.checkPrimeNumber(20);
    }
    @Test
    public void findPrimeNumbersBetweenTwoNumbers(){
        JavaBasicProgram.findPrimeNumbersBetweenTwoNumbers(2,20);
    }
    @Test
    public void palindromeNumber(){
        JavaBasicProgram.palindromeNumber(6);
        JavaBasicProgram.palindromeNumber(22);
        JavaBasicProgram.palindromeNumber(363);
        JavaBasicProgram.palindromeNumber(23);
        JavaBasicProgram.palindromeNumber(324);
        JavaBasicProgram.palindromeNumber(888);
    }
    @Test
    public void palindromeNumber_2(){
        JavaBasicProgram.palindromeNumber_2(6);
        JavaBasicProgram.palindromeNumber_2(22);
        JavaBasicProgram.palindromeNumber_2(363);
        JavaBasicProgram.palindromeNumber_2(187);
        JavaBasicProgram.palindromeNumber_2(2224);
        JavaBasicProgram.palindromeNumber_2(111);
    }
    @Test
    public void factorialProgramUsingLoop(){
        JavaBasicProgram.factorialProgramUsingLoop(0);
        JavaBasicProgram.factorialProgramUsingLoop(4);
        JavaBasicProgram.factorialProgramUsingLoop(5);
    }
    @Test
    public void factorialProgramUsingRecursion(){
        System.out.println(JavaBasicProgram.factorialProgramUsingRecursion(0));
        System.out.println(JavaBasicProgram.factorialProgramUsingRecursion(4));
        System.out.println(JavaBasicProgram.factorialProgramUsingRecursion(5));
    }
}









