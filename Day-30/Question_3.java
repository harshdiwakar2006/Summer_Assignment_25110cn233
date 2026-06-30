import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of employees
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Arrays to store employee details
        String[] empId = new String[n];
        String[] empName = new String[n];
        String[] department = new String[n];
        double[] salary = new double[n];

        // Input employee details
        System.out.println("\nEnter Employee Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter Employee ID: ");
            empId[i] = sc.nextLine();

            System.out.print("Enter Employee Name: ");
            empName[i] = sc.nextLine();

            System.out.print("Enter Department: ");
            department[i] = sc.nextLine();

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();
            sc.nextLine(); // Consume newline
        }

        // Display employee records
        System.out.println("\n===== Employee Records =====");
        System.out.printf("%-10s %-20s %-15s %-10s\n",
                "Emp ID", "Name", "Department", "Salary");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10s %-20s %-15s %-10.2f\n",
                    empId[i], empName[i], department[i], salary[i]);
        }

        sc.close();
    }
}
