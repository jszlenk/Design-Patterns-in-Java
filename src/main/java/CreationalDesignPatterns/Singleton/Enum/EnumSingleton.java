package CreationalDesignPatterns.Singleton.Enum;

enum EnumSingleton {

    INSTANCE;

    EnumSingleton() {
        value = 2;
    }

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
