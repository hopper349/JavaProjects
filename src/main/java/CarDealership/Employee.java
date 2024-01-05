package CarDealership;

public class Employee {


    public boolean handleCustomer(Vehicle vehicle, double amtInHand, boolean finance) {
        if (finance) {
            return financeCar(vehicle, amtInHand);
        } else if (amtInHand < vehicle.getVehicleCost()) {
            System.out.println("Customer is ineligible for purchasing the car.");
            return false;
        } else {
            System.out.println("Customer can purchase the car successfully");
            return true;
        }
    }

    private boolean financeCar(Vehicle vehicle, double amtInHand) {
        if (amtInHand < vehicle.getVehicleCost()) {
            if (amtInHand > (20 * vehicle.getVehicleCost()) / 100) {
                System.out.println("Car is financed successfully. \nCustomer needs to pay the sum of :" + (vehicle.getVehicleCost() - amtInHand));
                return true;
            } else {
                System.out.println("Customer is not eligible for financing. Amt in hand should be at least 20% of the car cost.");
                return false;
            }
        } else {
            System.out.println("Car can be bought directly. Customer doesn't require financing.");
            return true;
        }
    }
}
