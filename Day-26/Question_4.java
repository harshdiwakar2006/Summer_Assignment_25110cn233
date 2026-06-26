import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        // Question 1
        System.out.println("1. What is the capital of India?");
        System.out.println("a) Mumbai");
        System.out.println("b) New Delhi");
        System.out.println("c) Kolkata");
        System.out.print("Answer: ");
        char ans = sc.next().charAt(0);

        if (ans == 'b' || ans == 'B') {
            score++;
        }

        // Question 2
        System.out.println("\n2. Which language is used for Android development?");
        System.out.println("a) Java");
        System.out.println("b) Python");
        System.out.println("c) C");
        System.out.print("Answer: ");
        ans = sc.next().charAt(0);

        if (ans == 'a' || ans == 'A') {
            score++;
        }

        // Question 3
        System.out.println("\n3. Which planet is known as the Red Planet?");
        System.out.println("a) Venus");
        System.out.println("b) Mars");
        System.out.println("c) Jupiter");
        System.out.print("Answer: ");
        ans = sc.next().charAt(0);

        if (ans == 'b' || ans == 'B') {
            score++;
        }

        // Question 4
        System.out.println("\n4. How many days are there in a leap year?");
        System.out.println("a) 365");
        System.out.println("b) 364");
        System.out.println("c) 366");
        System.out.print("Answer: ");
        ans = sc.next().charAt(0);

        if (ans == 'c' || ans == 'C') {
            score++;
        }

        // Question 5
        System.out.println("\n5. Which keyword is used to create an object in Java?");
        System.out.println("a) new");
        System.out.println("b) class");
        System.out.println("c) object");
        System.out.print("Answer: ");
        ans = sc.next().charAt(0);

        if (ans == 'a' || ans == 'A') {
            score++;
        }

        // Result
        System.out.println("\n===== QUIZ RESULT =====");
        System.out.println("Your Score: " + score + "/5");

        if (score == 5) {
            System.out.println("Excellent! Perfect Score!");
        } else if (score >= 3) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Keep Practicing!");
        }

        sc.close();
    }
}
