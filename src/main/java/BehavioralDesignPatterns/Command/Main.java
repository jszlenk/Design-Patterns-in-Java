package BehavioralDesignPatterns.Command;

import com.google.common.collect.Lists;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount);

        List<BankAccountCommand> commands = List.of(
                new BankAccountCommand(bankAccount, BankAccountCommand.Action.DEPOSIT, 100),
                new BankAccountCommand(bankAccount, BankAccountCommand.Action.WITHDRAW, 1000)
        );

        for (Command c : commands) {
            c.call();
            System.out.println(bankAccount);
        }

        for (Command c : Lists.reverse(commands)) {
            c.undo();
            System.out.println(bankAccount);
        }
    }
}