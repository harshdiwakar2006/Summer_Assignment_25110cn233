import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth term : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println(a);
        System.out.println(b);
        for (int i = 1; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
        sc.close();
    }
}
