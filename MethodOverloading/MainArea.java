package MethodOverloading;
public class MainArea {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        int squareSide = 5;
        int squareArea = calculator.area(squareSide);
        System.out.println("Area of square with side " + squareSide + ": " + squareArea);

        int rectLength = 6;
        int rectBreadth = 4;
        int rectangleArea = calculator.area(rectLength, rectBreadth);
        System.out.println("Area of rectangle with length " + rectLength + " and breadth " + rectBreadth + ": " + rectangleArea);

        double circleRadius = 3.5;
        double circleArea = calculator.area(circleRadius);
        System.out.println("Area of circle with radius " + circleRadius + ": " + String.format("%.2f", circleArea));
    }
}