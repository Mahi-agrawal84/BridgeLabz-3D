package Level1;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 0) {
            long factorial = 1;
            int i = 1;
            while (i <= n) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial of " + n + " is " + factorial);
        } else {
            System.out.println("Factorial is not defined for negative numbers");
        }
    }
}

