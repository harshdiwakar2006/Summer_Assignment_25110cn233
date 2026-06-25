import java.util.HashSet;
import java.util.Set;

public class Question_2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";

        Set<Character> common = new HashSet<>();

        for (char ch : str1.toCharArray()) {
            if (str2.indexOf(ch) != -1) {
                common.add(ch);
            }
        }

        System.out.print("Common characters: ");
        for (char ch : common) {
            System.out.print(ch + " ");
        }
    }    
}
