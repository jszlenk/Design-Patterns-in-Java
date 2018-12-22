package BehavioralDesignPatterns.State.State;

class OffState extends State {

    OffState() {
        System.out.println("Light turned off");
    }

    @Override
    void on(LightSwitch ls) {
        System.out.println("Switching light on");
        ls.setState(new OnState());
    }
}