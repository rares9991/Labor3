import fabrik.Produkt;
import fabrik.Fabric;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Produkt a = new Produkt(10, 5, 17, 2);
        Produkt b = new Produkt(19, 6, 12, 12);
        Produkt c = new Produkt(13, 13, 13, 13);

        Fabric f = new Fabric();
        f.getMy_fabric().add(a);
        f.getMy_fabric().add(b);
        f.getMy_fabric().add(c);

        f.sort();

        f.assignCategory();

        f.optimal();
    }
}