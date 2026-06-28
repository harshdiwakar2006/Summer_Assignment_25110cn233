import java.util.Scanner;

class Ticket {
    int totalSeats = 50;
    int bookedSeats = 0;

    // Book Ticket
    void bookTicket(int seats) {
        if (seats <= (totalSeats - bookedSeats)) {
            bookedSeats += seats;
            System.out.println(seats + " ticket(s) booked successfully.");
        } else {
            System.out.println("Sorry! Only " + (totalSeats - bookedSeats) + " seat(s) available.");
        }
    }

    // Cancel Ticket
    void cancelTicket(int seats) {
        if (seats <= bookedSeats) {
            bookedSeats -= seats;
            System.out.println(seats + " ticket(s) cancelled successfully.");
        } else {
            System.out.println("Invalid cancellation.");
        }
    }

    // Display Available Seats
    void availableSeats() {
        System.out.println("Available Seats: " + (totalSeats - bookedSeats));
    }

    // Display Booking Details
    void displayDetails() {
        System.out.println("\n----- Ticket Details -----");
        System.out.println("Total Seats     : " + totalSeats);
        System.out.println("Booked Seats    : " + bookedSeats);
        System.out.println("Available Seats : " + (totalSeats - bookedSeats));
    }
}
public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ticket ticket = new Ticket();

        while (true) {
            System.out.println("\n===== Ticket Booking System =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Check Available Seats");
            System.out.println("4. Display Booking Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of tickets to book: ");
                    int book = sc.nextInt();
                    ticket.bookTicket(book);
                    break;

                case 2:
                    System.out.print("Enter number of tickets to cancel: ");
                    int cancel = sc.nextInt();
                    ticket.cancelTicket(cancel);
                    break;

                case 3:
                    ticket.availableSeats();
                    break;

                case 4:
                    ticket.displayDetails();
                    break;

                case 5:
                    System.out.println("Thank you for using the Ticket Booking System!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
