package CreationalDesignPatterns.Builder.Builder;

class Main {
    public static void main(String[] args) {

        HtmlBuilder builder = new HtmlBuilder("ul");
        builder.addChild("li", "Hello");
        builder.addChild("li", "World");
        System.out.println(builder);

        builder.clear();
        builder.addChildFluent("li", "Hello").addChildFluent("li", "World");
        System.out.println(builder);
    }
}