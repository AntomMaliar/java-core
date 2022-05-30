public class JavaBasic {
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
            if(numberOfDivisors < 3){
                System.out.println("It is prime number");
            }else {
                System.out.println("It isn't prime number");
            }
        }else {
            System.out.println("the prime number must be greater than 1");
        }
    }

}
