package CreationalDesignPatterns.Singleton.Basic;

import java.io.*;

class BasicSingleton implements Serializable {
    private BasicSingleton() {
        System.out.println("Singleton is initializing");
    }

    private static final BasicSingleton INSTANCE = new BasicSingleton();

    private int value = 0;

    int getValue() {
        return value;
    }

    void setValue(int value) {
        this.value = value;
    }

    protected Object readResolve() {
        return INSTANCE;
    }

    static BasicSingleton getInstance() {
        return INSTANCE;
    }
}