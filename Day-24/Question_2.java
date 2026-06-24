import java.util.Scanner;

public class Question_2 {
    public static String compress(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        // Append last character and its count
        result.append(str.charAt(str.length() - 1)).append(count);

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Compressed String: " + compress(str));

        sc.close();
    }
}
