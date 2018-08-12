package BehavioralDesignPatterns.Observer;

class Main implements Observer<Person> {

    private Main() {
        Person person = new Person();
        person.subscribe(this);

        for (int i = 1; i < 3; ++i) {
            person.setId(i);
        }

        for (int i = 24; i < 26; ++i) {
            person.setAge(i);
        }
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void handle(PropertyChangedEventArgs<Person> args) {
        System.out.println("Class: " + args.source.getClass().getSimpleName() + ", Property: " + args.propertyName.toLowerCase());
        System.out.println("Person's " + args.propertyName + " has been changed to " + args.newValue);
    }
}