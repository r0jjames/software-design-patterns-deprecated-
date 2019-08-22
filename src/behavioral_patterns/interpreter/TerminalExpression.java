package behavioral_patterns.interpreter;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        /* Note: This StringTokenizer is a legacy class that is retained for compatibility reasons
        although its use is discouraged in new code.*/
        StringTokenizer st = new StringTokenizer(context);

        while (st.hasMoreTokens()) {
            String test = st.nextToken();
            if (test.equals(data)) {
                return true;
            }
        }
        return false;
    }
}
