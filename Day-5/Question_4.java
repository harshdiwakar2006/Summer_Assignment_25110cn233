import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long n = sc.nextLong();

        long largestFactor = -1;

        while (n % 2 == 0) {
            largestFactor = 2;
            n /= 2;
        }

        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                largestFactor = i;
                n /= i;
            }
        }

        if (n > 2) {
            largestFactor = n;
        }

        System.out.println("Largest Prime Factor = " + largestFactor);

        sc.close();
    }
}
