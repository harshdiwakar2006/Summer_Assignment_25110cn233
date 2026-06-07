import java.util.Scanner;

public class Question_4 {

    static int rev = 0;

    static int reverse(int n) {
        if (n == 0)
            return rev;

        rev = rev * 10 + (n % 10);
        return reverse(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Reversed number = " + reverse(num));

        sc.close();
    }
}
