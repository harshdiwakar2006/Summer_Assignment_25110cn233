import java.util.Scanner;

class Contact {
    String name;
    String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    void display() {
        System.out.println("Name  : " + name);
        System.out.println("Phone : " + phone);
        System.out.println("----------------------");
    }
}

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Contact[] contacts = new Contact[100];
        int count = 0;

        while (true) {
            System.out.println("\n===== Contact Management System =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String phone = sc.nextLine();

                    contacts[count++] = new Contact(name, phone);
                    System.out.println("Contact added successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No contacts available.");
                    } else {
                        System.out.println("\n--- Contact List ---");
                        for (int i = 0; i < count; i++) {
                            contacts[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Name to Search: ");
                    String searchName = sc.nextLine();

                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (contacts[i].name.equalsIgnoreCase(searchName)) {
                            contacts[i].display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Name to Delete: ");
                    String deleteName = sc.nextLine();

                    found = false;
                    for (int i = 0; i < count; i++) {
                        if (contacts[i].name.equalsIgnoreCase(deleteName)) {
                            for (int j = i; j < count - 1; j++) {
                                contacts[j] = contacts[j + 1];
                            }
                            contacts[count - 1] = null;
                            count--;
                            found = true;
                            System.out.println("Contact deleted successfully!");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using the Contact Management System!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
