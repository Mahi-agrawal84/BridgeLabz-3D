package RideRoute;

public class Car extends Vehicle {
    public Car(double speed) {
        super(speed);
    }

    @Override
    public double calculateFare(double distance) {
        fare = distance * 10 + 20;
        return fare;
    }
}

