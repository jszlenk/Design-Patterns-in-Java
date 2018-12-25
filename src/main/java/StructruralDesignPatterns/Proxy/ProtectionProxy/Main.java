package StructruralDesignPatterns.Proxy.ProtectionProxy;

public class Main {
    public static void main(String[] args) {
        CarProxy car = new CarProxy(new Driver(19));
        car.drive();
    }
}