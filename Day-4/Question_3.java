
import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n = sc.nextInt();
        int n1 = n;
        int n2 = n1;
        int c = 0;
        int sum = 0;
        while (n > 0){
            n/=10;
            c++;
        }
        while(n1 > 0){
            int d1 = n1%10;
            sum += (int) Math.pow(d1,c);
            n1/=10;
        }
        if (sum == n2){
            System.out.println("It is a armstrong no.");
        }
        else {System.out.println("It is not a armstrong no.");}

    }
}
