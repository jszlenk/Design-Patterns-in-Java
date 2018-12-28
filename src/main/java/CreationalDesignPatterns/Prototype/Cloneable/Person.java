package CreationalDesignPatterns.Prototype.Cloneable;

import java.util.Arrays;

public class Person implements Cloneable {

    String[] names;
    Address address;

    public Person(String[] names, Address address) {
        this.names = names;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                ", address=" + address +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        return new Person(names.clone(), address instanceof Cloneable ? (Address) address.clone() : address);
    }
}