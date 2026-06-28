import java.util.Scanner;

class Book {
    int id;
    String title;
    String author;
    boolean issued;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.issued = false;
    }

    void display() {
        System.out.println("Book ID : " + id);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Status  : " + (issued ? "Issued" : "Available"));
        System.out.println("---------------------------");
    }
}

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book[] books = new Book[100];
        int count = 0;

        while (true) {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    books[count++] = new Book(id, title, author);
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No books available.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            books[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (books[i].id == searchId) {
                            books[i].display();
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Book not found.");
                    break;

                case 4:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = sc.nextInt();

                    found = false;
                    for (int i = 0; i < count; i++) {
                        if (books[i].id == issueId) {
                            if (!books[i].issued) {
                                books[i].issued = true;
                                System.out.println("Book issued successfully.");
                            } else {
                                System.out.println("Book is already issued.");
                            }
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Book not found.");
                    break;

                case 5:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();

                    found = false;
                    for (int i = 0; i < count; i++) {
                        if (books[i].id == returnId) {
                            if (books[i].issued) {
                                books[i].issued = false;
                                System.out.println("Book returned successfully.");
                            } else {
                                System.out.println("Book was not issued.");
                            }
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Book not found.");
                    break;

                case 6:
                    System.out.println("Thank you for using Library Management System.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
