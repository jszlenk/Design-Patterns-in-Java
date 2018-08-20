package CreationalDesignPatterns.Builder.RecursiveGenerics;

class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {
    EmployeeBuilder worksAs(String position) {
        person.position = position;
        return self();
    }

    @Override
    protected EmployeeBuilder self() {
        return this;
    }
}
