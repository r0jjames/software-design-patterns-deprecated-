package structural_patterns.flyweight;

// Instances of item will be the Flyweights
public class Item {
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

}
