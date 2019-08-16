package behavioral_patterns.command;

public class CommandDemo {
    public static void main(String[] args) {

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
