package fabrik;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class Produkt {
    private Map<String, Integer> lastYear = new HashMap<String, Integer>();
    private Map<String, Integer> thisYear = new HashMap<String, Integer>();
    private int demand;
    private String category;

    public Produkt(Integer lastYearCreated, Integer lastYearSold, Integer thisYearCreated, Integer thisYearSold) {
        this.lastYear.put("created", lastYearCreated);
        this.lastYear.put("sold", lastYearSold);
        this.thisYear.put("created", thisYearCreated);
        this.thisYear.put("sold", thisYearSold);
        this.demand = lastYearSold/lastYearCreated - thisYearSold/thisYearCreated;
        this.category = "";
    }

    public Map<String, Integer> getLastYear() {
        return lastYear;
    }

    public void setLastYear(Map<String, Integer> lastYear) {
        this.lastYear = lastYear;
    }

    public Map<String, Integer> getThisYear() {
        return thisYear;
    }

    public void setThisYear(Map<String, Integer> thisYear) {
        this.thisYear = thisYear;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getDemand() {
        return demand;
    }

    public void setDemand(int demand) {
        this.demand = demand;
    }
}
