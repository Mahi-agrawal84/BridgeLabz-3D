package MethodOverloading;
public class AreaCalculator {
	
    public int area(int side) {
        return side * side;
    }

    public int area(int length, int breadth) {
        return length * breadth;
    }

    public double area(double radius) {
        return Math.PI * radius * radius;
    }
}