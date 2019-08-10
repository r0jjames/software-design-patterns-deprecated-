package structural_patterns.composite;

import java.util.Iterator;
// The container (aka composite)
public class Menu extends MenuComponent {

    public Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }
    @Override
    public MenuComponent add(MenuComponent component) {
        components.add(component);
        return component;
    }
    @Override
    public MenuComponent remove(MenuComponent component) {
        components.remove(component);
        return component;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(); // builder pattern

        builder.append(print(this));
        Iterator<MenuComponent> components = this.components.iterator();

        while (components.hasNext()) {
            MenuComponent menuComponent = components.next();
            builder.append(menuComponent.toString());
        }
        return builder.toString();
    }
}
