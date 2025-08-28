package Methods;
public class randomPassword{
public static void main(String[] args) {

String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                     + "abcdefghijklmnopqrstuvwxyz"
                     + "0123456789"
                     + "!@#$%^&*()";

        int length = 10;
        String password = "";

        for (int i = 0; i < length; i++) {
            int index = (int)(Math.random() * chars.length());
            password += chars.charAt(index);
        }

        System.out.println("Random Password: " + password);
    }
}