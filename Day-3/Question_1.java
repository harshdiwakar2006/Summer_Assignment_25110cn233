import java.util.Scanner;
public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int count = 0;
        if (n == 1){
            System.out.println("Invailed number");
        }
        else if (n == 2){
            System.out.println("It is a prime number");
        }
        for (int i = 2; i < n; i++){
            count ++;
            }
        if (count != 0){
            System.out.println("It is a prime number");
        }
        else System.out.println("Not a prime number");
        sc.close();
    }
}
