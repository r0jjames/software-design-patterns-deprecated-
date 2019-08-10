package structural_patterns.decorator;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DecoratorDemo {
    public static void main(String[] args) throws Exception {

        Sandwhich sandwhich = new DressingDecorator(new MeatDecorator(new SimpleSandwhich()));
        System.out.println(sandwhich.make());

        Sandwhich sandwhich2 = new MeatDecorator(new SimpleSandwhich());
        System.out.println(sandwhich2.make());

    }

    public static void exampleEveryday() throws Exception{
        File file = new File("./output.txt");
        file.createNewFile();

        OutputStream oStream = new FileOutputStream(file);
        DataOutputStream doStream = new DataOutputStream(oStream);
        doStream.writeChars("This is Decorator Pattern Example");

        doStream.close();
        oStream.close();
    }
}
