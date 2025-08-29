package OOPS;
class Complex {
    int real, imag;

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    Complex add(Complex c) {
        return new Complex(real + c.real, imag + c.imag);
    }

    Complex subtract(Complex c) {
        return new Complex(real - c.real, imag - c.imag);
    }

    Complex multiply(Complex c) {
        int r = real * c.real - imag * c.imag;
        int i = real * c.imag + imag * c.real;
        return new Complex(r, i);
    }

    void display() {
        if (imag >= 0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " - " + (-imag) + "i");
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(1, 7);
        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);
        Complex prod = c1.multiply(c2);
        System.out.print("c1 = "); c1.display();
        System.out.print("c2 = "); c2.display();
        System.out.print("Sum = "); sum.display();
        System.out.print("Difference = "); diff.display();
        System.out.print("Product = "); prod.display();
    }
}

