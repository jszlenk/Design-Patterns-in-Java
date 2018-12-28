package CreationalDesignPatterns.Prototype.Cloneable;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Person zoe = new Person(new String[]{"Zoe", "Chan"}, new Address("Akacjowa", 1));

        Person ana = (Person) zoe.clone();
        ana.names[0] = "Ana";
        ana.address.houseNumber = 2;

        System.out.println(zoe);
        System.out.println(ana);
    }
}