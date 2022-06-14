package programs.basic;

public class PatternProgram {
    public static void printTopPyramid(){
        int leftSide = 1;
        int rightSide = 0;

        //print space
        for(int space = 4; space > 0; space--){
            for (int i = space; i > 0; i--){
                System.out.print(" ");
            }
            //print left side
            for(int i = leftSide; i > 0; i--){
                System.out.print("*");
            }
            //print right side
            for(int i = rightSide; i > 0; i--){
                System.out.print("*");
            }
            System.out.println();
            //***
            rightSide++;
            leftSide++;
        }
    }
    public static void printBottomPyramid(){
        int leftSide = 5;
        int rightSide = 4;
        //print space
        for(int space = 0; space < 5; space++){
            for(int i = space; i > 0; i--){
                System.out.print(" ");
            }
            //print leftSide
            for(int i = leftSide; i > 0; i--){
                System.out.print("*");
            }
            //print rightSide
            for(int i = rightSide; i > 0; i--){
                System.out.print("*");
            }
            System.out.println();
            leftSide--;
            rightSide--;
        }
    }
}






















