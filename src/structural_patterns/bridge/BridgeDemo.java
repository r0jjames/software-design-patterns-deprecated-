package structural_patterns.bridge;

public class BridgeDemo {
    public static void main(String[] args) {

        Movie movie = new Movie();
        movie.setClassfication("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");

        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);
        String printedMaterial = moviePrinter.print(printFormatter);
        System.out.println(printedMaterial);

        Formatter htmlFormatter = new HtmlFormatter();
        String printedHTML = moviePrinter.print(htmlFormatter);
        System.out.println(printedHTML);

    }

    public void exampleOne() {
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
