package BehavioralDesignPatterns.ChainOfResponsibility;

public class Soldier {
    private Game game;
    public String name;
    private int baseAttack, baseDefense;

    Soldier(Game game, String name, int baseAttack, int baseDefense) {
        this.game = game;
        this.baseAttack = baseAttack;
        this.baseDefense = baseDefense;
        this.name = name;
    }

    private int getAttack() {
        Query q = new Query(name, Query.Argument.ATTACK, baseAttack);
        game.queries.fire(q);
        return q.result;
    }

    private int getDefense() {
        Query q = new Query(name, Query.Argument.DEFENSE, baseDefense);
        game.queries.fire(q);
        return q.result;
    }

    @Override
    public String toString()
    {
        return "Soldier{name=" + name + ", attack=" + getAttack() + ", defense=" + getDefense() + "}";
    }
}
