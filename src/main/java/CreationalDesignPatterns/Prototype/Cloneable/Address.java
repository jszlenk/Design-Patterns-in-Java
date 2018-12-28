package CreationalDesignPatterns.Prototype.Cloneable;

public class Address implements Cloneable {

    private String streetName;
    int houseNumber;

    Address(String streetName, int houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        return new Address(streetName, houseNumber);
    }
}