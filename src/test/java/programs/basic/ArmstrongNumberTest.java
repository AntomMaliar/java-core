package programs.basic;

import org.junit.Test;

public class ArmstrongNumberTest {
    @Test
    public void checkArmstrongNumber(){
        ArmstrongNumber.checkArmstrongNumber(153);
        ArmstrongNumber.checkArmstrongNumber(45);
        ArmstrongNumber.checkArmstrongNumber(370);
    }
}
