package String;
public class nonRepeatedChar {
    public static void main(String[] args) {
        String str = "maahi";
        char result = '-';

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                result = c;
                break;
            }
        }

        if (result != '-') {
            System.out.println("First non-repeated character: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}
