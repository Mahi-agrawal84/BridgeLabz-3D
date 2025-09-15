package RideRoute;

public class Auto extends Vehicle {
    public Auto(double speed) {
        super(speed);
    }

    @Override
    public double calculateFare(double distance) {
        fare = distance * 7 + 10;
        return fare;
    }
}

