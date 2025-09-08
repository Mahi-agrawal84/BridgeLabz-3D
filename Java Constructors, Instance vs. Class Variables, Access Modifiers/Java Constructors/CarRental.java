package JavaConstructors;
public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay;
    double totalCost;

    CarRental() {
        this.customerName = "";
        this.carModel = "";
        this.rentalDays = 0;
        this.costPerDay = 1000;
        this.totalCost = 0;
    }

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = 1000;
        calculateTotalCost();
    }

    CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
        this.costPerDay = other.costPerDay;
        this.totalCost = other.totalCost;
    }

    void calculateTotalCost() {
        totalCost = rentalDays * costPerDay;
    }

    void displayDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + totalCost);
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental("John Doe", "SUV", 5);
        rental1.displayDetails();

        CarRental rental2 = new CarRental(rental1);
        rental2.displayDetails();
    }
}

