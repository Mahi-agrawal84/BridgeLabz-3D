package RideRoute;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Vehicle: 1. Bike 2. Car 3. Auto");
        int choice = sc.nextInt();

        System.out.println("Enter distance (km):");
        double distance = sc.nextDouble();

        Vehicle vehicle = null;
        if (choice == 1) {
            vehicle = new Bike(60);
        } else if (choice == 2) {
            vehicle = new Car(80);
        } else if (choice == 3) {
            vehicle = new Auto(50);
        }

        double baseFare = vehicle.calculateFare(distance);

        FareCalculator surge = new DynamicFare(1.2);
        double finalFare = surge.applySurge(baseFare);

        System.out.println("Base Fare: " + baseFare);
        System.out.println("Final Fare after Surge: " + finalFare);
        sc.close();
    }
}

