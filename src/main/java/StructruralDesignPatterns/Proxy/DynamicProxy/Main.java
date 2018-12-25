package StructruralDesignPatterns.Proxy.DynamicProxy;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        Human logged = Logging.withLogging(person);
        logged.walk();
        logged.talk();
        logged.talk();

        System.out.println(logged);
    }
}
