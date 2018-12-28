package CreationalDesignPatterns.Prototype.CopyConstructors;

public class Main {
    public static void main(String[] args) {

        Employee kai = new Employee("Kai", new Address("Römerstraße", "Bonn", "DE"));

        Employee uwe = new Employee(kai);

        uwe.name = "Uwe";
        System.out.println(kai);
        System.out.println(uwe);
    }
}