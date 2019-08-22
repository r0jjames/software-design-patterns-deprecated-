package behavioral_patterns.memento;

import java.io.*;

public class MementoDemo {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Employee employee = new Employee();
        employee.setName("Roj");
        employee.setPhone("09111111");
        employee.setAddress("111 Main Street");
        System.out.println("Employee before save: " + employee);
        caretaker.save(employee);

        employee.setPhone("12345678");
        caretaker.save(employee);
        System.out.println("Employee after changed phone number save: " + employee);
        employee.setPhone("66666666"); // <-- we haven't called save!
        caretaker.revert(employee);
        System.out.println("Reverts to last save point: " + employee);
        caretaker.revert(employee);
        System.out.println("Reverted to original: " + employee);

    }

    public static void everyDayExample() throws IOException {
        Employee employee = new Employee();
        employee.setName("Roj");
        employee.setAddress("My Address");
        employee.setPhone("4301218");

        serialize(employee);
        Employee emp = deserialize();
        System.out.println(emp.getName());
        System.out.println(emp.getAddress());
        System.out.println(emp.getPhone());

    }

    public static void serialize(Employee emp) throws IOException {

        try {
            File file = new File("D:/Users/Roj JC Carranza/Documents/Projects/software-design-patterns/memento.txt");
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            fileOut.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Employee deserialize() throws IOException {
        File file = new File("D:/Users/Roj JC Carranza/Documents/Projects/software-design-patterns/memento.txt");
        Employee employee = null;
        try {
            FileInputStream fileInput = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fileInput);
            employee = (Employee) in.readObject();
            in.close();
            fileInput.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return employee;
    }
}
