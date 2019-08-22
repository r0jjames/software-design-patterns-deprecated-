package behavioral_patterns.mediator;

import java.util.Timer;
import java.util.TimerTask;

public class MediatorDemo {
    private Timer timer;
    public static void main(String[] args) {

        System.out.println("About to schedule the task.");
        new MediatorDemo(3);
        System.out.println("Task scheduled.");
    }

    public MediatorDemo(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
        timer.schedule(new RemindTaskWithoutBeep(), seconds * 2 * 1000);
    }

    public class RemindTask extends TimerTask {

        @Override
        public void run() {
            System.out.println("Time's up");
        }
    }

    public class RemindTaskWithoutBeep extends TimerTask {

        @Override
        public void run() {
            System.out.println("Now Time's really up");
        }
    }
}
