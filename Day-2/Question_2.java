package Day_2;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int d = 0;
        while(n != 0){
            d = (n%10) + (d*10);
            n/=10;
        }
        System.out.println("The reverse of the number is " + d);
        sc.close();
    }
}
