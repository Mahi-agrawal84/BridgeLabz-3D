package MethodOverloading;

public class Printer {
    public void print(String message) {
        System.out.println(message);
    }

    public void print(int number) {
        System.out.println(number);
    }
}
class ColorPrinter extends Printer {
    @Override
    public void print(String message) {
        System.out.println(message + " in color");
    }
}

