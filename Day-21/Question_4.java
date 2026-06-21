import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a lowercase string: ");
        String str = sc.nextLine();

        String upper = str.toUpperCase();

        System.out.println("Uppercase string: " + upper);
    }
}
