package Eksamopg5;

public class Driver {
    public String name;
    public boolean isbooked;
    public int [] districtCoverage;

    public Driver(String name, boolean isbooked, int[] districtCoverage) {
        this.name = name;
        this.isbooked = false;
        this.districtCoverage = districtCoverage;
    }

    public String getName() {
        return name;
    }
}
