package CreationalDesignPatterns.Builder.BuilderFacets;

class PersonAddressBuilder extends PersonBuilder {
    PersonAddressBuilder(Person person) {
        this.person = person;
    }

    PersonAddressBuilder at(String streetAddress) {
        person.streetAddress = streetAddress;
        return this;
    }

    PersonAddressBuilder withPostcode(String postcode) {
        person.postcode = postcode;
        return this;
    }

    PersonAddressBuilder in(String city) {
        person.city = city;
        return this;
    }
}
