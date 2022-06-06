package polymorphism;

import org.junit.Test;

public class KeywordSuper {
    @Test
    public void toReferParentClassInstanceVariable(){
        B b = new B();
        b.printName();
    }
    @Test
    public void toInvokeParentClassMethod(){
        B b = new B();
        b.printNumber();
    }
    @Test
    public void toInvokeParentClassConstructor(){
        B b = new B(20);
    }
    @Test
    public void superIsProvidedByCompilerImplicitly(){
        D d = new D();
    }
}
