package BehavioralDesignPatterns.Mediator.ReactiveBroker;

public class Main {
    public static void main(String[] args) {

        EventBroker broker = new EventBroker();
        FootballPlayer player = new FootballPlayer(broker, "Oskar");
        FootballCoach coach = new FootballCoach(broker);
        coach.message("Hey Oskar, you scored goals", 0);

        player.score();
        player.score();
        player.score();
    }
}