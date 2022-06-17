package programs.number;

import org.junit.Test;
import polymorphism.A;

public class AutomorphicNumberTest {
    @Test
    public void isAutomorphic(){
        AutomorphicNumber.isAutomorphic(25);
        AutomorphicNumber.isAutomorphic(10);
        AutomorphicNumber.isAutomorphic(76);
        AutomorphicNumber.isAutomorphic(133);
        AutomorphicNumber.isAutomorphic(6);
    }
}
