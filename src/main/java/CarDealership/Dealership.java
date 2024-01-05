package CarDealership;

public class Dealership {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setName("Devon");
        customer.setAddress("21st Jump St. New York");
        customer.setCarName("kushaq2");
        customer.setAmtInHand(1500000);
        customer.setFinance(false);

        Employee employee = new Employee();
        Vehicle vehicle = new Vehicle(customer.getCarName());

        customer.purchaseCar(vehicle,employee, customer.isFinance());

        employee.handleCustomer(vehicle,customer.getAmtInHand(),customer.isFinance());


    }
}
