import java.util.HashSet;
import java.util.Scanner;

public class Question_4 {
    public static String removeDuplicates(String str) {
        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("String after removing duplicates: "
                           + removeDuplicates(str));

        sc.close();
    }
}
