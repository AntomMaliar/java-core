package programs.basic;

public class ArmstrongNumber {

    public static void checkArmstrongNumber(double number){

        // find power
        int temp = (int)number;
        double power = 0;
        while (temp > 0){
            power++;
            temp = temp / 10;
        }

        // find sum
        double result = 0;
        double sum = 0;
        double digit = 0;
        temp = (int)number;
        while (temp > 0){
            digit = temp % 10;
            sum = Math.pow(digit, power) + sum;
            temp = temp / 10;
        }

        // check
        if(sum == number){
            System.out.println(number + " is armstrong number");
        }
        else {
            System.out.println(number + " is not armstrong number");
        }
    }
}
