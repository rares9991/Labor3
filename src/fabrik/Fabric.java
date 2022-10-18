package fabrik;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Fabric {
    private List<Produkt> my_fabric = new ArrayList<>();

    public Fabric() {
        this.my_fabric = new ArrayList<>();
    }

    public List<Produkt> getMy_fabric() {
        return my_fabric;
    }

    public void setMy_fabric(List<Produkt> my_fabric) {
        this.my_fabric = my_fabric;
    }

    public void sort(){
        my_fabric.sort(Comparator.comparing(Produkt::getDemand));
    }

    public void assignCategory(){
        for(Produkt p: my_fabric){
            if (p.getDemand() < 0)
                p.setCategory("#a");
            else if (p.getDemand() == 0)
                p.setCategory("#b");
            else
                p.setCategory("#c");
        }
    }

    public void optimal(){
        assignCategory();
        for (Produkt p: my_fabric){
            if(Objects.equals(p.getCategory(), "#a")) {
                System.out.print("For next year we need to make:");
                System.out.println(p.getThisYear().get("sold") + p.getThisYear().get("sold")/2);
            }
            else if (Objects.equals(p.getCategory(), "#b")) {
                System.out.print("For next year we need to make:");
                System.out.println(p.getThisYear().get("sold") + p.getThisYear().get("sold")/10);
            }
            else{
                System.out.print("For next year we need to make:");
                System.out.println(p.getThisYear().get("sold") - p.getThisYear().get("sold")/10);
            }
        }
    }
}
