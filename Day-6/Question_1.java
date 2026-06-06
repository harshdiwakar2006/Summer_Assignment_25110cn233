import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        if (decimal == 0) {
            System.out.println("Binary = 0");
            return;
        }

        String binary = "";

        while (decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal = decimal / 2;
        }

        System.out.println("Binary = " + binary);

        sc.close();
    }
}
