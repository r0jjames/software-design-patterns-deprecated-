package behavioral_patterns.command;

import java.util.ArrayList;
import java.util.List;

public class AllLightsCommand implements Command {
    List<Light> lights = new ArrayList<>();

    public AllLightsCommand(List<Light> lights) {
        this.lights = lights;
    }
    @Override
    public void execute() {
        for (Light light : lights) {
            light.toggle();
        }
    }
}
