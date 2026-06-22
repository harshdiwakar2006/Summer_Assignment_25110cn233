import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String[] words = sentence.trim().split("\\s+");

        System.out.println("Number of words: " + words.length);
    }
}
