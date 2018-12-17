package BehavioralDesignPatterns.ChainOfResponsibility;

public class DoubleAttack extends SoldierModifier implements AutoCloseable {
    private int token;

    DoubleAttack(Game game, Soldier soldier) {
        super(game, soldier);

        token = game.queries.subscribe(q -> {
            if (q.soliderName.equals(soldier.name) && q.argument == Query.Argument.ATTACK) {
                q.result *= 2;
            }
        });
    }

    @Override
    public void close() {
        game.queries.unsubscribe(token);
    }
}