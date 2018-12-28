package CreationalDesignPatterns.Prototype.CopyConstructors;

public class Address {

    private String streetAddress, city, country;

    Address(String streetAddress, String city, String country) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.country = country;
    }

    Address(Address other) {
        this(other.streetAddress, other.city, other.country);
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetAddress=" + streetAddress + ", city=" + city + ", country=" + country +
                "}";
    }
}