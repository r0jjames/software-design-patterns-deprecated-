package structural_patterns.decorator;

public abstract class SandwhichDecorator implements Sandwhich {

    Sandwhich customSandwhich;

    SandwhichDecorator(Sandwhich customSandwhich) {
        this.customSandwhich = customSandwhich;
    }

    public String make() {
        return customSandwhich.make();
    }
}
