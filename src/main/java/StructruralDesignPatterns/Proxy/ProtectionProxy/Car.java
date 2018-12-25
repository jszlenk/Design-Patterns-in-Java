package StructruralDesignPatterns.Proxy.ProtectionProxy;

public class Car implements Drivable {

    Driver driver;

    Car(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void drive() {
        System.out.println("Car being driver");
    }
}