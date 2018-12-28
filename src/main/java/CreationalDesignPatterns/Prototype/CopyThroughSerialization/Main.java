package CreationalDesignPatterns.Prototype.CopyThroughSerialization;

import org.apache.commons.lang3.SerializationUtils;

public class Main {
    public static void main(String[] args) {

        Thing thing = new Thing("life", 18);
        Thing thing2 = SerializationUtils.roundtrip(thing);

        thing2.stuff = "car";

        System.out.println(thing);
        System.out.println(thing2);
    }
}
