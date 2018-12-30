package BehavioralDesignPatterns.Mediator.ChatRoom;

public class Main {
    public static void main(String[] args) {

        ChatRoom room = new ChatRoom();

        Person adam = new Person("Adam");
        Person olga = new Person("Olga");

        room.join(adam);
        room.join(olga);

        adam.say("hi room");
        olga.say("ok, hey adam");

        Person kuba = new Person("Kuba");
        room.join(kuba);
        kuba.say("hi everyone!");

        olga.privateMessage("Kuba", "glad you could join us!");
        kuba.privateMessage("Olga", "thx!");

        System.out.println("-----");

        for (String dialog : olga.chatLog) {
            System.out.println(dialog);

        }
    }
}