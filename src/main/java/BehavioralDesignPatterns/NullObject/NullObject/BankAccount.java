package BehavioralDesignPatterns.NullObject.NullObject;

class BankAccount {

    private Log log;
    private int balance;

    BankAccount(Log log) {
        this.log = log;
    }

    void deposit(int amount) {
        balance += amount;

        if (log != null) {
            log.info("Deposited " + amount + ", balance is now " + balance);
        }
    }

    void withdraw(int amount) {

        if (balance >= amount) {
            balance -= amount;
            if (log != null) {
                System.out.println("Withdrew " + amount + ", we have " + balance + " left");
            }
        } else {
            if (log != null) {
                log.warn("Could not withdraw " + amount + " because balance is only " + balance);
            }
        }

    }
}