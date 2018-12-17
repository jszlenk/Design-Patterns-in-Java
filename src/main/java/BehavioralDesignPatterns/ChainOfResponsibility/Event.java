package BehavioralDesignPatterns.ChainOfResponsibility;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

class Event<TArgs> {
    private int index = 0;
    private Map<Integer, Consumer<TArgs>> handlers = new HashMap<>();

    int subscribe(Consumer<TArgs> handler) {
        int i = index;
        handlers.put(index++, handler);
        return i;
    }

    void unsubscribe(int key) {
        handlers.remove(key);
    }

    void fire(TArgs args) {
        for (Consumer<TArgs> handler : handlers.values())
            handler.accept(args);
    }
}