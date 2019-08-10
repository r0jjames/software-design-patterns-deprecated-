package structural_patterns.decorator;

public class SimpleSandwhich implements Sandwhich {

    @Override
    public String make() {
        return "Bread";
    }
}
