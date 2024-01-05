package CarDealership;

import java.util.Locale;

public class Vehicle {

    public Vehicle(String carName,String company, double price) {
        this.carName = carName;
        this.company = company;
        this.price = price;
    }

    private String carName;
    private String company;
    private double price;

    public double getVehicleCost(){
        switch (carName.trim().toLowerCase(Locale.ROOT)){
            case "wagonr":
                return 120000;
            case "compass":
                return 3500000;
            case "kushaq":
                return 1800000;
            default:
                System.out.println("We don't have the requested vehicle.");
                return -1;
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "carName='" + carName + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                '}';
    }
}
