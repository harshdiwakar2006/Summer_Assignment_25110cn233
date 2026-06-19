import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {

            // Primary diagonal
            sum += matrix[i][i];

            // Secondary diagonal
            sum += matrix[i][n - 1 - i];
        }

        // Avoid double-counting center element
        if (n % 2 == 1) {
            sum -= matrix[n / 2][n / 2];
        }

        System.out.println("Diagonal Sum = " + sum);
    }
}
