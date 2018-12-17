package BehavioralDesignPatterns.ChainOfResponsibility;

class IncreasedDefense extends SoldierModifier {

    IncreasedDefense(Game game, Soldier soldier) {
        super(game, soldier);

        game.queries.subscribe(q -> {
            if (q.soliderName.equals(soldier.name) && q.argument == Query.Argument.DEFENSE) {
                q.result += 3;
            }
        });
    }
}
