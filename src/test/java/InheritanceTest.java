import org.junit.Test;

import java.util.concurrent.Callable;

public class InheritanceTest {
    @Test
    public void singleInheritance(){
        B b = new B();
        b.printA();
        b.printB();
    }
    @Test
    public void multilevelInheritance(){
        C c = new C();
        c.printA();
        c.printB();
        c.printC();
    }
    @Test
    public void hierarchicalInheritance(){
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.printAnimal();
        cat.printAnimal();
    }
}
