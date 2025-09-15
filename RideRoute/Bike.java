package RideRoute;
public class Bike extends Vehicle {
    public Bike(double speed) {
        super(speed);
    }

    @Override
    public double calculateFare(double distance) {
        fare = distance * 5;
        return fare;
    }
}

