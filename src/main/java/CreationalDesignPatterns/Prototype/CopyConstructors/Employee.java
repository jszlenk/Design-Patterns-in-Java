package CreationalDesignPatterns.Prototype.CopyConstructors;

public class Employee {

    public String name;
    private Address address;

    Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    Employee(Employee other) {
        name = other.name;
        address = new Address(other.address);
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", address=" + address + "}";
    }
}