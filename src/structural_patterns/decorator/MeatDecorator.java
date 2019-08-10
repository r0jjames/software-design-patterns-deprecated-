package structural_patterns.decorator;

public class MeatDecorator extends SandwhichDecorator {

    MeatDecorator(Sandwhich customSandwhich) {
        super(customSandwhich);
    }

    public String make() {
        return customSandwhich.make() + addMeat();
    }

    public String addMeat() {
        return " + turkey";
    }
}

