import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");

        for (int i = start; i <= end; i++) {
            int temp = i;
            int digits = 0;
            int sum = 0;

            // Count digits
            int num = temp;
            while (num > 0) {
                digits++;
                num /= 10;
            }

            // Calculate Armstrong sum
            num = temp;
            while (num > 0) {
                int digit = num % 10;
                sum += (int) Math.pow(digit, digits);
                num /= 10;
            }

            if (sum == temp) {
                System.out.print(temp + " ");
            }
        }

        sc.close();

    }
}
