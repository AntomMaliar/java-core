package programs.basic;

import org.junit.Test;

public class PatternProgramTest {
    @Test
    public void rightTrianglePattern(){
        for (int amount = 1; amount <= 5; amount++){
            for(int i = amount; i > 0; i--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    @Test
    public void leftTrianglePattern(){
        int star = 1;
        for(int space = 5; space > 0; space--){
            // print space
            for (int i = space; i > 0; i--){
                System.out.print(" ");
            }
            //print star
            for(int i = star; i > 0; i--){
                System.out.print("*");
            }
            // add star
            star++;
            System.out.println();
        }
    }
    @Test
    public void pyramidPattern(){
        PatternProgram.printTopPyramid();
    }
    @Test
    public void  diamondShapePattern(){
        PatternProgram.printTopPyramid();
        PatternProgram.printBottomPyramid();
    }
    @Test
    public void rightPascalsTriangle(){
        //print top
        for(int top = 1; top < 5; top++){
            for (int i = top; i > 0; i--){
                System.out.print("*");
            }
            System.out.println();
        }
        //print bottom
        for (int bottom = 5; bottom > 0; bottom--){
            for(int i = bottom; i > 0; i--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    @Test
    public void leftPascalsTriangle(){
        int starsTop = 1;
        int starsBottom = 5;
        // print top
        // print space
        for(int space = 4; space > 0; space--) {
            for (int i = space; i > 0; i--) {
                System.out.print(" ");
            }
            // print star
            for (int i = starsTop; i > 0; i--) {
                System.out.print("*");
            }
            System.out.println();
            starsTop++;
        }
        //print bottom
        for(int spaceBottom = 0; spaceBottom < 5; spaceBottom++){
            for (int i = spaceBottom; i > 0; i--){
                System.out.print(" ");
            }
            //print stars
            for(int i = starsBottom; i > 0; i--){
                System.out.print("*");
            }
            System.out.println();
            starsBottom--;
        }
    }
    @Test
    public void letterAPattern(){
        int space_2 = 1;
        //print space_1
        for (int space_1 = 5; space_1 > 0; space_1--){
            for(int i = space_1; i > 0; i--){
                System.out.print(" ");
            }
            System.out.print("*");
            if(space_1 <= 4 && space_1 != 3){
                for (int i = space_2; i > 0; i--){
                    System.out.print(" ");
                }
                System.out.print("*");
                space_2++;
            }
            if(space_1 == 3){
                for (int i = 3; i > 0; i--){
                    System.out.print("*");
                }
                space_2++;
            }
            System.out.println();
        }

    }
}


































