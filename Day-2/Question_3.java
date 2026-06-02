package Day_2;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int d = 1;
        while(n != 0){
            d = (n%10) * d;
            n/=10;
        }
        System.out.println("The product of the digits of the number is " + d);
        sc.close();
    }
}
