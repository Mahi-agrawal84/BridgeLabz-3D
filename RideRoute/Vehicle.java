package RideRoute;
abstract class Vehicle {
    protected double speed;
    protected double fare;

    public Vehicle(double speed) {
        this.speed = speed;
    }

    public abstract double calculateFare(double distance);

    public double getSpeed() {
        return speed;
    }
}

