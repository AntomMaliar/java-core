public class JavaBasicProgram {
    public static void printFibonacci(int amount, int n1, int n2) {
        if(n1 + n2 < 2){
            System.out.print(n1+" "+n2);
            amount = amount - 2;
        }
        if(amount > 0){
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            amount--;
            printFibonacci(amount, n1, n2);
        }
    }
    public static void checkPrimeNumber(int number){
        if(number > 1){
            int numberOfDivisors = 0;
            for (int i = 1; i <= number; i++){
                if(number % i == 0){
                    numberOfDivisors++;
                }
            }
            if(numberOfDivisors == 2){
                System.out.println("It is prime number");
            }else {
                System.out.println("It isn't prime number");
            }
        }else {
            System.out.println("the prime number must be greater than 1");
        }
    }
    public static void findPrimeNumbersBetweenTwoNumbers(int n1, int n2){
        int numberOfDivisors = 0;
        // the range of numbers between two numbers
        for (int number = n1; number <= n2; number++){
            // check if number is prime
            for (int divisor = 1; divisor <= number; divisor++){
                if(number % divisor == 0){
                    numberOfDivisors++;
                }
            }
            // print prime number
            if(numberOfDivisors == 2){
                System.out.print(number + " ");
            }
            //update
            numberOfDivisors = 0;
        }
    }
    public static void palindromeNumber(int number){
        int sum = 0;
        int temporary = number;

        while (temporary > 0){
            int remainder = temporary % 10;
            sum = (sum * 10) + remainder;
            temporary = temporary / 10;
        }

        if (sum == number){
            System.out.println(number + " - Number is palindrome");
        }
        else {
            System.out.println(number + " - Number is not palindrome");
        }
    }
    public static void palindromeNumber_2(int number){
        int temp = number;
        int sum = 0;
        int remaider = 0;

        while (temp > 0){
            remaider = temp % 10;
            temp = temp / 10;

            if(temp > 0){
                sum = (sum + remaider) * 10;
            }
            else {
                sum = sum + remaider;
            }
        }
        if(sum == number){
            System.out.println(number + " - Number is palindrome");
        }
        else{
            System.out.println(number + " - Number is not palindrome");
        }
    }
    public static void factorialProgramUsingLoop(int number){
        if (number == 0 ){
            System.out.println("factorial 0 = 1");
            return;
        }

        int result = 1;
        for(int i = 1; i <=number; i++){
            result = result * i;
        }
        System.out.println("farctorial " + number + " = " + result);
    }
    public static int factorialProgramUsingRecursion(int number){
        if (number == 0) {
            return 1;
        }
        else{
            return(number * factorialProgramUsingRecursion(number-1));
        }
    }
}




























