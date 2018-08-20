package CreationalDesignPatterns.Builder.RecursiveGenerics;

class Person {
    String name;
    String position;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
