package CreationalDesignPatterns.Builder.RecursiveGenerics;

class PersonBuilder<PB extends PersonBuilder<PB>> {
    Person person = new Person();

    PB withName(String name) {
        person.name = name;
        return self();
    }

    @SuppressWarnings("unchecked")
    protected PB self() {
        return (PB) this;
    }

    Person build() {
        return person;
    }
}
