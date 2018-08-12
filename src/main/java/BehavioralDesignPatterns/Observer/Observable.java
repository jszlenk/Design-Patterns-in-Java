package BehavioralDesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

class Observable<T> {
    private List<Observer<T>> observers = new ArrayList<>();

    void subscribe(Observer<T> observer) {
        observers.add(observer);
    }

    void propertyChanged(T source, String propertyName, Object newValue) {
        for (Observer<T> o : observers) {
            o.handle(new PropertyChangedEventArgs<>(source, propertyName, newValue));
        }
    }
}
