package MethodOverloading;
public class MainPrinter {
    public static void main(String[] args) {
        Printer printer = new Printer();
        System.out.println("Testing Printer class:");
        printer.print("Hello from Printer");
        printer.print(123);

        System.out.println("\nTesting ColorPrinter class:");
        ColorPrinter colorPrinter = new ColorPrinter();
        colorPrinter.print("Hello from ColorPrinter");
        colorPrinter.print(456);
    }
}
