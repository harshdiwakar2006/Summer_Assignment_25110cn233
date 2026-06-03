
import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower limit : ");
        int n = sc.nextInt();
        System.out.print("Enter the lower upper : ");
        int m = sc.nextInt();
        for (int i = n; i <= m; i++){
            int count = 0;
            for (int j = 2; j < i; j++){
                if ((i%j) == 0){
                    count ++;
                }
            }
            if (count == 0 && i > 1){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
