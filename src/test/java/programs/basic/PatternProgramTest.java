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
    public void PyramidPattern(){
        PatternProgram.printTopPyramid();
    }
    @Test
    public void  diamondShapePattern(){
    }
}


































