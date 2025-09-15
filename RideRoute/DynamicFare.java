package RideRoute;
public class DynamicFare implements FareCalculator {
    private double surgeMultiplier;

    public DynamicFare(double surgeMultiplier) {
        this.surgeMultiplier = surgeMultiplier;
    }

    @Override
    public double applySurge(double baseFare) {
        return baseFare * surgeMultiplier;
    }
}

