package BehavioralDesignPatterns.Observer;

interface Observer<T> {
    void handle(PropertyChangedEventArgs<T> args);
}
