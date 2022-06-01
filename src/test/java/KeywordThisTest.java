import org.junit.Test;

public class KeywordThisTest {
    @Test
    public void invokeCurrentClassMethod(){
        KeywordThis keywordThis  = new KeywordThis();
        keywordThis.n();
    }
    @Test
    public void invokeCurrentClassConstructor(){
        KeywordThis keywordThis = new KeywordThis(20);
    }
}
