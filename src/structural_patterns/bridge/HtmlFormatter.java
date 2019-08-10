package structural_patterns.bridge;

import java.util.List;

public class HtmlFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append("<table>");
        builder.append("<th>");
        builder.append("Classification");
        builder.append("</th>");
        builder.append("<th>");
        builder.append(header);
        builder.append("</th>");


        for (Detail detail : details) {
            builder.append("<tr>");
            builder.append("<td>" + detail.getLabel() + "</td>");
            builder.append("<td>" + detail.getValue() + "</td>");
            builder.append("</tr>");
        }
        builder.append("</table>");
        return builder.toString();
    }
}
