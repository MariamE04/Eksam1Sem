package Eksamopg5;

public class Main {
    public static void main(String[] args) {
        // Create an instance of RickshawService
        RickshawService r = new RickshawService();

        // Specify the districts the driver covers (District 1 and District 3)
        int[] districts = new int[]{1, 3};

        // Create a driver named "Pete" who covers the specified districts
        Driver pete = r.creatDriver("Pete", districts);

        // Print driver details to the console
        System.out.println("Driver Name: " + pete.name);
        System.out.print("Districts Covered: ");

        // Print the districts the driver covers
        for (int district : pete.districtCoverage) {
            System.out.print(district + " ");
        }
    }
}

