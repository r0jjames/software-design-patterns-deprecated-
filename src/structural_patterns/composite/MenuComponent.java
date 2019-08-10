package structural_patterns.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
    protected String name;
    protected String url;

    List<MenuComponent> components = new ArrayList<>();

    public String print(MenuComponent component) {
        StringBuilder builder = new StringBuilder(name);
        builder.append(": ");
        builder.append(url);
        builder.append("\n");
        return builder.toString();
    }
    public MenuComponent add(MenuComponent component) {
        throw new UnsupportedOperationException("Feature not implement at this level");
    }

    public MenuComponent remove(MenuComponent component) {
        throw new UnsupportedOperationException("Feature not implement at this level");
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
