package CreationalDesignPatterns.Prototype.CopyThroughSerialization;

import java.io.Serializable;

public class Thing implements Serializable {

    String stuff;
    private int age;

    Thing(String stuff, int age) {
        this.stuff = stuff;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Thing{" + "stuff=" + stuff + ", age=" + age + "}";
    }
}
