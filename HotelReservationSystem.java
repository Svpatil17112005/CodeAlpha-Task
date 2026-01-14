import java.util.ArrayList;
import java.util.Scanner;

// Room class
class Room {
    int roomNumber;
    String category;
    double price;
    boolean isBooked;

    Room(int roomNumber, String category, double price) {
        this.roomNumber = roomNumber;
        this.category = category;
        this.price = price;
        this.isBooked = false;
    }
}

// Booking class
class Booking {
    String customerName;
    Room room;

    Booking(String customerName, Room room) {
        this.customerName = customerName;
        this.room = room;
    }
}

// Main System class
public class import java.util.ArrayList;
import java.util.Scanner;

// Room class
class Room {
    int roomNumber;
    String category;
    double price;
    boolean isBooked;

    Room(int roomNumber, String category, double price) {
        this.roomNumber = roomNumber;
        this.category = category;
        this.price = price;
        this.isBooked = false;
    }
}

// Booking class
class Booking {
    String customerName;
    Room room;

    Booking(String customerName, Room room) {
        this.customerName = customerName;
        this.room = room;
    }
}

// Main System class
public class HotelReservationSystem {

    static ArrayList<Room> rooms = new ArrayList<>();
    static ArrayList<Booking> bookings = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Add rooms
        rooms.add(new Room(101, "Standard", 1500));
        rooms.add(new Room(102, "Standard", 1500));
        rooms.add(new Room(201, "Deluxe", 2500));
        rooms.add(new Room(301, "Suite", 4000));

        int choice;

        do {
            System.out.println("\n===== Hotel Reservation System =====");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. View Bookings");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    showAvailableRooms();
                    break;

                case 2:
                    bookRoom(sc);
                    break;

                case 3:
                    cancelBooking(sc);
                    break;

                case 4:
                    viewBookings();
                    break;

                case 5:
                    System.out.println("Thank you for using Hotel Reservation System!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }

    // Show available rooms
    static void showAvailableRooms() {
        System.out.println("\n--- Available Rooms ---");
        for (Room r : rooms) {
            if (!r.isBooked) {
                System.out.println("Room " + r.roomNumber +
                        " | " + r.category +
                        " | ₹" + r.price);
            }
        }
    }

    // Book room
    static void bookRoom(Scanner sc) {
        System.out.print("Enter your name: ");
        sc.nextLine(); // consume newline
        String name = sc.nextLine();

        showAvailableRooms();

        System.out.print("Enter room number to book: ");
        int roomNo = sc.nextInt();

        for (Room r : rooms) {
            if (r.roomNumber == roomNo && !r.isBooked) {
                System.out.println("Processing payment of ₹" + r.price + "...");
                r.isBooked = true;
                bookings.add(new Booking(name, r));
                System.out.println("Room booked successfully!");
                return;
            }
        }
        System.out.println("Room not available!");
    }

    // Cancel booking
    static void cancelBooking(Scanner sc) {
        System.out.print("Enter your name to cancel booking: ");
        sc.nextLine();
        String name = sc.nextLine();

        for (Booking b : bookings) {
            if (b.customerName.equalsIgnoreCase(name)) {
                b.room.isBooked = false;
                bookings.remove(b);
                System.out.println("Booking cancelled successfully!");
                return;
            }
        }
        System.out.println("No booking found!");
    }

    // View bookings
    static void viewBookings() {
        System.out.println("\n--- Booking Details ---");
        if (bookings.isEmpty()) {
            System.out.println("No bookings available.");
            return;
        }

        for (Booking b : bookings) {
            System.out.println("Customer: " + b.customerName +
                    " | Room: " + b.room.roomNumber +
                    " | " + b.room.category);
        }
    }
}
 {

    static ArrayList<Room> rooms = new ArrayList<>();
    static ArrayList<Booking> bookings = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Add rooms
        rooms.add(new Room(101, "Standard", 1500));
        rooms.add(new Room(102, "Standard", 1500));
        rooms.add(new Room(201, "Deluxe", 2500));
        rooms.add(new Room(301, "Suite", 4000));

        int choice;

        do {
            System.out.println("\n===== Hotel Reservation System =====");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. View Bookings");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    showAvailableRooms();
                    break;

                case 2:
                    bookRoom(sc);
                    break;

                case 3:
                    cancelBooking(sc);
                    break;

                case 4:
                    viewBookings();
                    break;

                case 5:
                    System.out.println("Thank you for using Hotel Reservation System!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }

    // Show available rooms
    static void showAvailableRooms() {
        System.out.println("\n--- Available Rooms ---");
        for (Room r : rooms) {
            if (!r.isBooked) {
                System.out.println("Room " + r.roomNumber +
                        " | " + r.category +
                        " | ₹" + r.price);
            }
        }
    }

    // Book room
    static void bookRoom(Scanner sc) {
        System.out.print("Enter your name: ");
        sc.nextLine(); // consume newline
        String name = sc.nextLine();

        showAvailableRooms();

        System.out.print("Enter room number to book: ");
        int roomNo = sc.nextInt();

        for (Room r : rooms) {
            if (r.roomNumber == roomNo && !r.isBooked) {
                System.out.println("Processing payment of ₹" + r.price + "...");
                r.isBooked = true;
                bookings.add(new Booking(name, r));
                System.out.println("Room booked successfully!");
                return;
            }
        }
        System.out.println("Room not available!");
    }

    // Cancel booking
    static void cancelBooking(Scanner sc) {
        System.out.print("Enter your name to cancel booking: ");
        sc.nextLine();
        String name = sc.nextLine();

        for (Booking b : bookings) {
            if (b.customerName.equalsIgnoreCase(name)) {
                b.room.isBooked = false;
                bookings.remove(b);
                System.out.println("Booking cancelled successfully!");
                return;
            }
        }
        System.out.println("No booking found!");
    }

    // View bookings
    static void viewBookings() {
        System.out.println("\n--- Booking Details ---");
        if (bookings.isEmpty()) {
            System.out.println("No bookings available.");
            return;
        }

        for (Booking b : bookings) {
            System.out.println("Customer: " + b.customerName +
                    " | Room: " + b.room.roomNumber +
                    " | " + b.room.category);
        }
    }
}
