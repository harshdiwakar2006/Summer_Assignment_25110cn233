import java.util.Scanner;

public class Question_4 {
    static Scanner sc = new Scanner(System.in);

    static String[] roll = new String[50];
    static String[] name = new String[50];
    static int[] marks = new int[50];
    static int count = 0;

    // Function to add a student
    static void addStudent() {
        System.out.print("Enter Roll Number: ");
        roll[count] = sc.next();

        sc.nextLine();
        System.out.print("Enter Name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks[count] = sc.nextInt();

        count++;
        System.out.println("Student Record Added Successfully.\n");
    }

    // Function to display all students
    static void displayStudents() {
        if (count == 0) {
            System.out.println("No Records Found.\n");
            return;
        }

        System.out.println("\nRoll No\tName\t\tMarks");
        System.out.println("--------------------------------");
        for (int i = 0; i < count; i++) {
            System.out.println(roll[i] + "\t" + name[i] + "\t\t" + marks[i]);
        }
        System.out.println();
    }

    // Function to search a student
    static void searchStudent() {
        System.out.print("Enter Roll Number to Search: ");
        String r = sc.next();

        for (int i = 0; i < count; i++) {
            if (roll[i].equals(r)) {
                System.out.println("Record Found");
                System.out.println("Roll No : " + roll[i]);
                System.out.println("Name    : " + name[i]);
                System.out.println("Marks   : " + marks[i]);
                return;
            }
        }
        System.out.println("Record Not Found.\n");
    }

    // Function to delete a student
    static void deleteStudent() {
        System.out.print("Enter Roll Number to Delete: ");
        String r = sc.next();

        for (int i = 0; i < count; i++) {
            if (roll[i].equals(r)) {
                for (int j = i; j < count - 1; j++) {
                    roll[j] = roll[j + 1];
                    name[j] = name[j + 1];
                    marks[j] = marks[j + 1];
                }
                count--;
                System.out.println("Record Deleted Successfully.\n");
                return;
            }
        }
        System.out.println("Record Not Found.\n");
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice!\n");
            }

        } while (choice != 5);

        sc.close();
    }
}
