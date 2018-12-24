package BehavioralDesignPatterns.NullObject.NullObject;

public class Main {
    public static void main(String[] args) {

        //ConsoleLog log = new ConsoleLog();
        //Log log = null;

        NullLog nullLog = new NullLog();

        BankAccount bankAccount = new BankAccount(nullLog);
        bankAccount.deposit(300);
        bankAccount.withdraw(200);
    }
}