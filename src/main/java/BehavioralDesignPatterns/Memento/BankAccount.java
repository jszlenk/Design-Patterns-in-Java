package BehavioralDesignPatterns.Memento;

public class BankAccount {

    private int balance;

    BankAccount(int balance) {
        this.balance = balance;
    }

    Memento deposit(int amount) {
        balance += amount;
        return new Memento(balance);
    }

    void restore(Memento m) {
        balance = m.balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "balance=" + balance + '}';
    }
}
