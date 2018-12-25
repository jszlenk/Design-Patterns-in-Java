package StructruralDesignPatterns.Proxy.ProtectionProxy;

public class CarProxy extends Car {

    CarProxy(Driver driver) {
        super(driver);
    }

    @Override
    public void drive() {
        if (driver.age >= 16) {
            super.drive();
        } else {
            System.out.println("Driver too young!");
        }
    }
}