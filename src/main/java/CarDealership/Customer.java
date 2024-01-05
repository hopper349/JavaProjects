package CarDealership;

public class Customer {

    private String name;
    private String address;
    private String carName;
    private double amtInHand;
    private boolean finance;

    public boolean isFinance() {
        return finance;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAmtInHand() {
        return amtInHand;
    }

    public void setAmtInHand(double amtInHand) {
        this.amtInHand = amtInHand;
    }

    public String purchaseCar(Vehicle vehicle, Employee employee, boolean finance){

        return "";
    }
}
