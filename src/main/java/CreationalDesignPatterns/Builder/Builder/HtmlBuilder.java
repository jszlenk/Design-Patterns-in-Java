package CreationalDesignPatterns.Builder.Builder;

class HtmlBuilder {
    private String rootName;
    private HtmlElement root = new HtmlElement();

    HtmlBuilder(String rootName) {
        this.rootName = rootName;
        root.name = rootName;
    }

    void addChild(String childName, String childText) {
        HtmlElement e = new HtmlElement(childName, childText);
        root.elements.add(e);
    }

    HtmlBuilder addChildFluent(String childName, String childText) {
        HtmlElement e = new HtmlElement(childName, childText);
        root.elements.add(e);
        return this;
    }

    void clear() {
        root = new HtmlElement();
        root.name = rootName;
    }

    @Override
    public String toString() {
        return root.toString();
    }
}
