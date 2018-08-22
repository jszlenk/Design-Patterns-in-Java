package BehavioralDesignPatterns.Strategy;

import java.util.List;
import java.util.function.Supplier;

public class TextProcessor<LS extends ListStrategy> {
    private StringBuilder sb = new StringBuilder();
    private LS listStrategy;

    TextProcessor(Supplier<? extends LS> ctor) {
        listStrategy = ctor.get();
    }

    void appendList(List<String> items) {
        listStrategy.start(sb);
        for (String item : items)
            listStrategy.addListItem(sb, item);
        listStrategy.end(sb);
    }

    public void clear() {
        sb.setLength(0);
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
