package behavioral_patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {

        BikeRepository repo = new BikeRepository();
        repo.addBike("Cervelo");
        repo.addBike("Scott");
        repo.addBike("Fugi");

        repo.addBike("CerveloFake");
        repo.addBike("ScottFake");
        repo.addBike("FugiFake");

        repo.addBike("CerveloOrig");
        repo.addBike("ScottOrig");
        repo.addBike("FugiOrig");

        repo.addBike("CerveloMadeInChina");
        repo.addBike("ScottMadeInChina");
        repo.addBike("FugiMadeInChina");
        System.out.println("------------iterator-------------");
        Iterator<String> bikeIterator = repo.iterator();
        while (bikeIterator.hasNext()) {
            System.out.println(bikeIterator.next());
        }

        // Alternative
        System.out.println("------------FOR LOOP-------------");
        for (String bike : repo) {
            System.out.println(bike);
        }
    }
    public static void everyDayExample() {
        List<String> names = new ArrayList<>();
        names.add("Camille");
        names.add("Roj");
        names.add("Rashin");
        System.out.println("Names size: " + names.size());
        Iterator<String> namesItr = names.iterator();
        while (namesItr.hasNext()) {
            String name = namesItr.next();
            System.out.println(name);
            namesItr.remove();
        }
        System.out.println("Names size: " + names.size());
    }
}
