package structural_patterns.decorator;

public class DressingDecorator extends SandwhichDecorator {

    DressingDecorator(Sandwhich customSandwhich) {
        super(customSandwhich);
    }

    public String make(){
        return customSandwhich.make() + addDressing();
    }

    private String addDressing() {
        return " + mustard";
    }


}
