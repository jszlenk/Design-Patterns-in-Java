package CreationalDesignPatterns.Builder.RecursiveGenerics;

class Main {
    public static void main(String[] args) {
        EmployeeBuilder eb = new EmployeeBuilder()
                .withName("Jakub")
                .worksAs("Java Developer");
        System.out.println(eb.build());
    }
}