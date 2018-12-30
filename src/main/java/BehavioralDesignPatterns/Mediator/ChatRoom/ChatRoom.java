package BehavioralDesignPatterns.Mediator.ChatRoom;

import java.util.ArrayList;
import java.util.List;

class ChatRoom {

    private List<Person> people = new ArrayList<>();

    void broadcast(String source, String message) {

        for (Person person : people)
            if (!person.name.equals(source)) {
                person.receive(source, message);
            }
    }

    void join(Person person) {

        String joinMsg = person.name + " joins the chat";
        broadcast("room", joinMsg);
        person.room = this;
        people.add(person);
    }

    void message(String source, String destination, String message) {

        people.stream()
                .filter(p -> p.name.equals(destination))
                .findFirst()
                .ifPresent(person -> person.receive(source, message));
    }
}