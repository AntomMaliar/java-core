package serialization;

import java.io.Serializable;

public class Parent implements Serializable {
    String nameParent;

}
class Child extends Parent{
    String nameChild;
    Child(String nameParent, String nameChild){
        this.nameParent = nameParent;
        this.nameChild = nameChild;
    }
}
