package BehavioralDesignPatterns.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Soldier husarz = new Soldier(game, "Husarz", 3, 4);

        System.out.println(husarz);
        IncreasedDefense increasedDefense = new IncreasedDefense(game, husarz);

        try (DoubleAttack doubleAttack = new DoubleAttack(game, husarz)) {
            System.out.println(husarz);
        }

        System.out.println(husarz);
    }
}
