package BehavioralDesignPatterns.Observer;

class Person extends Observable<Person> {
    private int age;
    private int id;

    void setId(int id) {
        if (this.id == id) {
            return;
        }
        this.id = id;
        propertyChanged(this, "id", id);
    }

    void setAge(int age) {
        if (this.age == age) {
            return;
        }
        this.age = age;
        propertyChanged(this, "age", age);
    }
}
