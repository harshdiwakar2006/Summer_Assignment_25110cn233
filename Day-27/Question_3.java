import java.util.ArrayList;
import java.util.Scanner;

class Salary {
    int empId;
    String empName;
    double basicSalary;
    double hra;
    double da;
    double grossSalary;

    Salary(int empId, String empName, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
        this.hra = basicSalary * 0.20;   // 20% HRA
        this.da = basicSalary * 0.10;    // 10% DA
        this.grossSalary = basicSalary + hra + da;
    }

    void display() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("Gross Salary  : " + grossSalary);
        System.out.println("-----------------------------");
    }
}

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Salary> salaries = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Salary Management System =====");
            System.out.println("1. Add Salary Record");
            System.out.println("2. Display All Records");
            System.out.println("3. Search Salary Record");
            System.out.println("4. Delete Salary Record");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    double basic = sc.nextDouble();

                    salaries.add(new Salary(id, name, basic));
                    System.out.println("Salary record added successfully.");
                    break;

                case 2:
                    if (salaries.isEmpty()) {
                        System.out.println("No salary records found.");
                    } else {
                        for (Salary s : salaries) {
                            s.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (Salary s : salaries) {
                        if (s.empId == searchId) {
                            s.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Salary record not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = sc.nextInt();
                    boolean removed = false;

                    for (int i = 0; i < salaries.size(); i++) {
                        if (salaries.get(i).empId == deleteId) {
                            salaries.remove(i);
                            removed = true;
                            System.out.println("Salary record deleted successfully.");
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Salary record not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
