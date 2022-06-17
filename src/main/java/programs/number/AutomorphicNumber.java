package programs.number;

public class AutomorphicNumber {
    public static void isAutomorphic(int number){
        int square = number * number;
        int numberZeros = 1;
        // find number of zero
        while (numberZeros < number){
            numberZeros = numberZeros * 10;
        }
        // find result
        int result = square % numberZeros;
        //check
        if (result == number){
            System.out.println("number " + number + " is automorphic");
        }
        else {
            System.out.println("number " + number + " is not automorphic");
        }
    }
}
