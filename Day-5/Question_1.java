import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++){
            if (n%i == 0){
                sum += i;
            }
        }
        if (sum == n){
            System.out.println("It is a perfect number");
        }else System.out.println("It is not a perfect number");
    }
}
