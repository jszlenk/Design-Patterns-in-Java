package BehavioralDesignPatterns.Mediator.ReactiveBroker;

import java.lang.String;

class FootballCoach {

    private String message;

    FootballCoach(EventBroker broker) {
        broker.subscribe(i -> message("", i));
    }

    void message(String msg, Integer i) {

        if (!msg.isBlank()) {
            message = msg;
            System.out.println(message + ": " + i);
        } else {
            System.out.println(message + ": " + i);
        }
    }
}