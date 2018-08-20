package CreationalDesignPatterns.Builder.BuilderFacets;

public class Main {
    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();
        Person person = pb
                .lives()
                .at("Monte 123")
                .in("Sopot")
                .withPostcode("80-200")
                .works()
                .at("Software")
                .asA("Engineer")
                .earning(100000)
                .build();
        System.out.println(person);
    }
}
