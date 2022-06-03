public class A {
    public void printA(){
        System.out.println("class A");
    }
}
class B extends A {
    public void printB(){
        System.out.println("class B");
    }
}
class C extends B {
    public void printC(){
        System.out.println("class C");
    }
}