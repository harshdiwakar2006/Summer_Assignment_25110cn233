package Day_1;

import java.util.Scanner;

public class Question_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int d = 0;

        while (n != 0) {

            d = d + (n % 10);

            n = n / 10;
        }

        System.out.println("The sum of digits is = " + d);

        sc.close();
    }
}
