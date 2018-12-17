package BehavioralDesignPatterns.ChainOfResponsibility;

class SoldierModifier {
    protected Game game;
    protected Soldier soldier;

    SoldierModifier(Game game, Soldier soldier) {
        this.game = game;
        this.soldier = soldier;
    }
}