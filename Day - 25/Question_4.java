import java.util.Arrays;
import java.util.Comparator;

public class Question_4 {
    public static void main(String[] args) {
        String[] words = {"apple", "cat", "elephant", "dog", "banana"};

        Arrays.sort(words, Comparator.comparingInt(String::length));

        System.out.println("Words sorted by length:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
