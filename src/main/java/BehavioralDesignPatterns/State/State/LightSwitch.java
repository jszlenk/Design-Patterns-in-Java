package BehavioralDesignPatterns.State.State;

class LightSwitch {

    private State state;

    LightSwitch() {
        state = new OffState();
    }

    void setState(State state) {
        this.state = state;
    }

    void on() {
        state.on(this);
    }

    void off() {
        state.off(this);
    }
}