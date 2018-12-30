package BehavioralDesignPatterns.Mediator.ReactiveBroker;

public class FootballPlayer {

    private int goalsScored = 0;
    private EventBroker broker;
    public String name;

    FootballPlayer(EventBroker broker, String name) {
        this.broker = broker;
        this.name = name;
    }

    void score() {
        broker.publish(++goalsScored);
    }
}