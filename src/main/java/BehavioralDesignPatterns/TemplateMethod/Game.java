package BehavioralDesignPatterns.TemplateMethod;

public abstract class Game {
    Game(int numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    void run() {
        start();
        while (!haveWinner()) {
            turnTurn();
        }
        System.out.println("Player " + getWinningPlayer() + " wins");
    }

    protected abstract int getWinningPlayer();
    protected abstract void turnTurn();
    protected abstract boolean haveWinner();
    protected abstract void start();

    protected int currentPlayer;
    protected final int numberOfPlayer;
}
