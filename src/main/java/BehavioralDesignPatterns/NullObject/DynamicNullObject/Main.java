package BehavioralDesignPatterns.NullObject.DynamicNullObject;

public class Main {

    public static void main(String[] args) {

        NullLog nullLog = new NullLog();
        Log log = nullLog.nullObject();

        BankAccount bankAccount = new BankAccount(log);
        bankAccount.deposit(100);
        bankAccount.withdraw(200);
    }
}