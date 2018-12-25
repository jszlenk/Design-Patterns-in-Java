package StructruralDesignPatterns.Proxy.PropertyProxy;

class Creature {

    private Property<Integer> agility = new Property<>(10);

    int getAgility() {
        return agility.getValue();
    }

    void setAgility(int value) {
        agility.setValue(value);
    }
}