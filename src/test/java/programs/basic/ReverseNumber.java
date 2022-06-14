package programs.basic;

import org.junit.Test;

public class ReverseNumber {
    @Test
    public void reverseNumber1(){
        int a = 1234567;
        int reverseNumber = 0;
        int digit;

        while (a > 0){
            digit = a % 10;
            reverseNumber = reverseNumber*10 + digit;
            a = a / 10;
        }
        System.out.println(reverseNumber);
    }
}
