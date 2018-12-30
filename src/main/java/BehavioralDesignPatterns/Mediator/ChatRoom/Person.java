package BehavioralDesignPatterns.Mediator.ChatRoom;

import java.util.ArrayList;
import java.util.List;

public class Person {

    public String name;
    ChatRoom room;
    List<String> chatLog = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    void receive(String source, String message) {
        String sm = source + ": "  + message;
        System.out.println("[" + name + "'s chat session] " + sm);
        chatLog.add(sm);
    }

    void say(String message) {
        room.broadcast(name, message);
    }

    void privateMessage(String who, String message) {
        room.message(name, who, message);
    }
}