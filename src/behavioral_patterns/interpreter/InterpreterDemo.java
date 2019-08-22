package behavioral_patterns.interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterDemo {
    public static void main(String[] args) {
       String context = "Lions and Bears";

       Expression define = buildInterpreterTree();
        System.out.println(context + " is " + define.interpret(context));
    }

    public static void everyDayExample() {
        String input = "Lions, and tigers, and bears! Oh, my!";

        Pattern pattern = Pattern.compile("(lion|Lion|cat|dog|wolf|bear|human|tiger|liger)");
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()) {
            System.out.println("Found a " + matcher.group() + ".");
        }
    }
    static Expression buildInterpreterTree() {
        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");

        // Tigers and Bears
        Expression alternation1 = new AndExpression(terminal2, terminal3);
        // Lions or (Tigers and Bears)
        Expression alternation2 = new OrExpression(terminal1, alternation1);
        return  new AndExpression(terminal3, alternation2);
    }
}
