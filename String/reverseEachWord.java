package String;
public class reverseEachWord {
    public static void main(String[] args) {
        String str = "Java is fun";
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String w : words) {
            StringBuilder rev = new StringBuilder(w);
            result.append(rev.reverse()).append(" ");
        }

        System.out.println("Reversed each word: " + result.toString().trim());
    }
}

