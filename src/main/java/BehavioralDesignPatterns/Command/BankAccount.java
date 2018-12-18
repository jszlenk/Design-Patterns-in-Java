package BehavioralDesignPatterns.Command;

public class BankAccount {

    private int balance;

    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ", balance is now " + balance);
    }

    boolean withdraw(int amount) {
        int overdraftLimit = -500;
        if (balance - amount >= overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ", balance is now " + balance);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BankAccount{balance=" + balance + '}';
    }
}