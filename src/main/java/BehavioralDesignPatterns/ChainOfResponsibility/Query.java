package BehavioralDesignPatterns.ChainOfResponsibility;

class Query {
    String soliderName;

    enum Argument {
        ATTACK, DEFENSE
    }

    Argument argument;
    int result;

    Query(String soliderName, Argument argument, int result) {
        this.soliderName = soliderName;
        this.argument = argument;
        this.result = result;
    }
}