package BehavioralDesignPatterns.State.ConsoleStateMachine;

import org.javatuples.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

class StateMachine {

    private final Rules rules = new Rules();
    private State currentState = State.OFF_HOOK;
    private State existState = State.ON_HOOK;

    void machineState() {

        Map<State, List<Pair<Trigger, State>>> rulesList = rules.addRules();

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("The phone is currenttly " + currentState);
            System.out.println("Select a trigger:");

            for (int i = 0; i < rulesList.get(currentState).size(); ++i) {
                Trigger trigger = rulesList.get(currentState).get(i).getValue0();
                System.out.println("" + i + ". " + trigger);
            }

            boolean parseOK;
            int choice = 0;

            do {
                try {
                    System.out.println("Please enter your choice:");
                    choice = Integer.parseInt(console.readLine());
                    parseOK = choice >= 0 && choice < rulesList.get(currentState).size();
                } catch (IOException e) {
                    parseOK = false;
                    e.printStackTrace();
                }

            } while (!parseOK);

            currentState = rulesList.get(currentState).get(choice).getValue1();

        } while (currentState != existState);

        System.out.println("And we are done!");
    }
}