public class KeywordThis {
    public void m () {
        System.out.println("m");
    }
    public void n() {
        System.out.println("n");
        this.m();
    }
    public KeywordThis(){}
    // ***
    public KeywordThis(int number){
        this("Hello");
        System.out.println("your nember is = " + number);
    }
    public KeywordThis(String word){
        System.out.println("another constructor " + word);
    }
    // ***

}
