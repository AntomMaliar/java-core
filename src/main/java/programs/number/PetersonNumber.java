package programs.number;

public class PetersonNumber {
    public static void PetersonNumberRange(int startNumber, int endNumber){
        for(int number = startNumber; number < endNumber; number++){
            //divide number on digit
            int temp = number;
            int factorial = 1;
            int digit;
            int sum = 0;

            while (temp > 0){
                digit = temp % 10;
                //Find the factorial of the digit.
                while (digit > 0){
                    factorial = factorial * digit;
                    digit--;
                }
                sum = sum + factorial;
                factorial = 1;
                temp = temp / 10;
            }
            //check
            if(number == sum){
                System.out.println("number "+ number + " is Peterson");
            }
        }
    }
}
