package structural_patterns.bridge;

public class BridgeDemo {
    public static void main(String[] args) {

        Color blue = new Blue();
        Shape square = new Square(blue);
        Color green = new Green();
        Shape circle = new Circle(green);

        Shape squareGreen = new Square(green);
        square.applyColor();
        circle.applyColor();
        squareGreen.applyColor();

    }
}
