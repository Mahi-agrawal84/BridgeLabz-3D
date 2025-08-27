package String;
public class charFrequency {
    public static void main(String[] args) {
        String str = "banana";
        char ch = 'a';
        int count = 0;

        for (char c : str.toCharArray()) {
            if (c == ch) count++;
        }

        System.out.println("Frequency of '" + ch + "': " + count);
    }
}

