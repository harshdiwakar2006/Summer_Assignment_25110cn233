package Day_2;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int d = 0;

        while (n != 0) {

            d = d + (n%10);

            n = n / 10;
        }

        System.out.println("The number of digits are = " + d);

        sc.close();
    }
}
