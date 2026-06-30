import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Arrays to store student details
        String[] name = new String[n];
        String[] rollNo = new String[n];
        String[] course = new String[n];
        int[] marks = new int[n];

        // Input student details
        System.out.println("\nEnter Student Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Roll Number: ");
            rollNo[i] = sc.nextLine();

            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Course: ");
            course[i] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine(); // Consume newline
        }

        // Display student records
        System.out.println("\n===== Student Records =====");
        System.out.printf("%-10s %-20s %-15s %-10s\n",
                "Roll No", "Name", "Course", "Marks");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10s %-20s %-15s %-10d\n",
                    rollNo[i], name[i], course[i], marks[i]);
        }

        sc.close();
    }
}
