package BehavioralDesignPatterns.Memento;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(100);
        Memento m1 = bankAccount.deposit(50);
        Memento m2 = bankAccount.deposit(25);
        System.out.println(bankAccount);

        bankAccount.restore(m1);
        System.out.println(bankAccount);

        bankAccount.restore(m2);
        System.out.println(bankAccount);
    }
}