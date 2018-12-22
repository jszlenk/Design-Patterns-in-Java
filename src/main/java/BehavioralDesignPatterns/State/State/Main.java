package BehavioralDesignPatterns.State.State;

public class Main {
    public static void main(String[] args) {

        LightSwitch lightSwitch = new LightSwitch();
        lightSwitch.on();
        lightSwitch.off();
        lightSwitch.off();
    }
}