package polymorphism;

public class A {
    public A(){}
    //***
    String name = "class A";
    //***
    public void printNumber(){
        System.out.println("class A = " + 10);
    }
    //***
    public A(int a){
        System.out.println("Constructor class A = " + a);
    }
}

class B extends A {
    public B(){}
    //***
    String name = "class B";
    public void printName(){
        System.out.println(name);
        System.out.println(super.name);
    }
    //***
    public void printNumber(){
        System.out.println("class B = " + 50);
        super.printNumber();
    }
    //***
    public B(int b){
        super(50);
        System.out.println("Constructor class B = " + b);
    }
}
