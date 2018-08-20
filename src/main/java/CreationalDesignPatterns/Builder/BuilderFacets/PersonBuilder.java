package CreationalDesignPatterns.Builder.BuilderFacets;

class PersonBuilder {
    protected Person person = new Person();

    PersonJobBuilder works() {
        return new PersonJobBuilder(person);
    }

    PersonAddressBuilder lives() {
        return new PersonAddressBuilder(person);
    }

    Person build() {
        return person;
    }
}
