package behavioral_patterns.chain_of_responsibility;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChainOfResponsibilityDemo {
    private static final Logger logger = Logger.getLogger(ChainOfResponsibilityDemo.class.getName());
    public static void main (String[] args) {

        Director bryan = new Director();
        VP crystal = new VP();
        CEO jeff = new CEO();

        bryan.setSuccessor(crystal);
        crystal.setSuccessor(jeff);

        Request request = new Request(RequestType.CONFERENCE, 500);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        bryan.handleRequest(request);
    }

    public static void exampleOne() {

        // level to log at
        logger.setLevel(Level.FINER);

        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.FINEST);
        logger.addHandler(handler);

        logger.finest("Finest level of logging"); // this won't print
        logger.finer("Finer level, but not as fine as finest");
        logger.finest("Fine, but not as fine as finer of finest");
    }
}
