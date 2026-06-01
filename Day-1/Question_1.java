import java.util.Scanner;
public class Question_1 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. :");
        int n = sc.nextInt();
        int c = 0;
        for (int i = 1; i <= n; i++){
            c = c+i;
        }
        System.out.println("The sum of first "+n+" number is "+c);
        sc.close();

    }
}