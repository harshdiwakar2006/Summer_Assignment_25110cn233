import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Arrays to store book details
        String[] bookId = new String[n];
        String[] bookName = new String[n];
        String[] author = new String[n];
        boolean[] issued = new boolean[n];

        // Input book details
        System.out.println("\nEnter Book Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nBook " + (i + 1));

            System.out.print("Enter Book ID: ");
            bookId[i] = sc.nextLine();

            System.out.print("Enter Book Name: ");
            bookName[i] = sc.nextLine();

            System.out.print("Enter Author Name: ");
            author[i] = sc.nextLine();

            issued[i] = false; // Initially available
        }

        // Display library records
        System.out.println("\n===== Library Records =====");
        System.out.printf("%-10s %-25s %-20s %-10s\n",
                "Book ID", "Book Name", "Author", "Status");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10s %-25s %-20s %-10s\n",
                    bookId[i],
                    bookName[i],
                    author[i],
                    issued[i] ? "Issued" : "Available");
        }

        sc.close();
    }
}
