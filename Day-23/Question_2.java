import java.util.HashSet;

public class Question_2 {
    public static char firstRepeating(String str) {
        HashSet<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (set.contains(ch)) {
                return ch;
            }
            set.add(ch);
        }

        return '\0'; // No repeating character
    }

    public static void main(String[] args) {
        String str = "abcaef";

        char result = firstRepeating(str);

        if (result != '\0') {
            System.out.println("First repeating character: " + result);
        } else {
            System.out.println("No repeating character found.");
        }
    }
}
