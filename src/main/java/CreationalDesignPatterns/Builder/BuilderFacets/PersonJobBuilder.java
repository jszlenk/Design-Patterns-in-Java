package CreationalDesignPatterns.Builder.BuilderFacets;

class PersonJobBuilder extends PersonBuilder {
    PersonJobBuilder(Person person) {
        this.person = person;
    }

    PersonJobBuilder at(String companyName) {
        person.companyName = companyName;
        return this;
    }

    PersonJobBuilder asA(String position) {
        person.position = position;
        return this;
    }

    PersonJobBuilder earning(int annualIncome) {
        person.annualIncome = annualIncome;
        return this;
    }
}
