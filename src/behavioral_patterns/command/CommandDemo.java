package behavioral_patterns.command;

import java.util.ArrayList;
import java.util.List;

// Client
public class CommandDemo {
    public static void main(String[] args) {

        Light bedLight = new Light();
        Light kitchenLight = new Light();
        Switch lightSwitch = new Switch();

        Command onCommand = new OnCommand(bedLight);
        lightSwitch.storeAndExecute(onCommand);

        Command toggleCommand = new ToggleCommand(bedLight);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);

        List<Light> lights = new ArrayList<>();
        lights.add(bedLight);
        lights.add(kitchenLight);
        Command allLightsCommand = new AllLightsCommand(lights);
        lightSwitch.storeAndExecute(allLightsCommand);
    }

    public static void everyDayExample() {

        Task task1 = new Task(10, 20);
        Task task2 = new Task(30, 40);

        Thread thread1 = new Thread(task1);
        thread1.start();

        Thread thread2 = new Thread(task2);
        thread2.start();
    }
}
