package Polymorphism;
public class ShapeDemo {
public static void main(String[] args) {
	Shape[] shapes = {
       new Circle(5.0),
       new Rectangle(4.0, 6.0)    
   };
   for (Shape s : shapes) {
       System.out.println("Area: " + s.area());
   }
}
}