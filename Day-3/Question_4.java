import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int x = a;
        int y = b;

        // Find GCD using Euclidean Algorithm
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        int gcd = x;
        int lcm = (a * b) / gcd;

        System.out.println("LCM = " + lcm);

        sc.close();
    }
}
