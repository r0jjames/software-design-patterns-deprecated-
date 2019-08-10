package structural_patterns.composite;

public class MenuItem extends MenuComponent {

    MenuItem(String name, String url) {
        this.name = name;
        this.url = url;
    }
    @Override
    public String toString() {
        return print(this);
    }
}
