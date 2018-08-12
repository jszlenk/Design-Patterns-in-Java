package BehavioralDesignPatterns.Observer;

class PropertyChangedEventArgs<T> {
    T source;
    String propertyName;
    Object newValue;

    PropertyChangedEventArgs(T source, String propertyName, Object newValue) {
        this.source = source;
        this.propertyName = propertyName;
        this.newValue = newValue;
    }
}