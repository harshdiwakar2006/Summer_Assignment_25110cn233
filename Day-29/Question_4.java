import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] itemName = new String[10];
        int[] quantity = new int[10];
        double[] price = new double[10];
        int count = 0, choice;

        do {
            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Item");
            System.out.println("2. Display Items");
            System.out.println("3. Search Item");
            System.out.println("4. Update Quantity");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    if (count < 10) {
                        System.out.print("Enter Item Name: ");
                        itemName[count] = sc.nextLine();

                        System.out.print("Enter Quantity: ");
                        quantity[count] = sc.nextInt();

                        System.out.print("Enter Price: ");
                        price[count] = sc.nextDouble();

                        count++;
                        System.out.println("Item Added Successfully!");
                    } else {
                        System.out.println("Inventory is Full!");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No items in inventory.");
                    } else {
                        System.out.println("\nItem\t\tQuantity\tPrice");
                        for (int i = 0; i < count; i++) {
                            System.out.println(itemName[i] + "\t\t" + quantity[i] + "\t\t" + price[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Item Name to Search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (itemName[i].equalsIgnoreCase(search)) {
                            System.out.println("Item Found!");
                            System.out.println("Name: " + itemName[i]);
                            System.out.println("Quantity: " + quantity[i]);
                            System.out.println("Price: " + price[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Item Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Item Name to Update: ");
                    String update = sc.nextLine();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (itemName[i].equalsIgnoreCase(update)) {
                            System.out.print("Enter New Quantity: ");
                            quantity[i] = sc.nextInt();
                            System.out.println("Quantity Updated Successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Item Not Found!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting Inventory Management System...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
