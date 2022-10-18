import fabrik.Produkt;
import fabrik.Fabric;

import java.util.Map;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produkt a = new Produkt(1,10, 5, 17, 2);
        Produkt b = new Produkt(2,19, 6, 12, 12);
        Produkt c = new Produkt(3,13, 13, 13, 13);

        Fabric f = new Fabric();
        f.getMy_fabric().add(a);
        f.getMy_fabric().add(b);
        f.getMy_fabric().add(c);

        f.sort();
        System.out.println("Nr. 1");
        f.printFabric();
        f.assignCategory();
        System.out.println("Nr. 2");
        f.printFabric();
        System.out.println("Nr. 3");
        f.optimal();
    }
}