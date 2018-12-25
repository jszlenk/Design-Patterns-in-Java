package StructruralDesignPatterns.Proxy.PropertyProxy;

public class Main {

    public static void main(String[] args) {

        Creature creature = new Creature();
        creature.setAgility(12);
        creature.setAgility(22);

        int creatures = creature.getAgility();
        System.out.println(creatures);
    }
}