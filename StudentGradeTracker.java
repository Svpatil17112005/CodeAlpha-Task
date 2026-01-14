import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Integer> studentMarks = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== Student Grade Tracker =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Summary");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter student name: ");
                    sc.nextLine(); // consume newline
                    String name = sc.nextLine();

                    System.out.print("Enter marks: ");
                    int marks = sc.nextInt();

                    studentNames.add(name);
                    studentMarks.add(marks);

                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (studentMarks.isEmpty()) {
                        System.out.println("No student data available.");
                        break;
                    }

                    int total = 0;
                    int highest = studentMarks.get(0);
                    int lowest = studentMarks.get(0);

                    System.out.println("\n----- Student Summary -----");
                    for (int i = 0; i < studentNames.size(); i++) {
                        System.out.println(studentNames.get(i) + " : " + studentMarks.get(i));
                        total += studentMarks.get(i);

                        if (studentMarks.get(i) > highest)
                            highest = studentMarks.get(i);

                        if (studentMarks.get(i) < lowest)
                            lowest = studentMarks.get(i);
                    }

                    double average = (double) total / studentMarks.size();

                    System.out.println("---------------------------");
                    System.out.println("Average Marks : " + average);
                    System.out.println("Highest Marks : " + highest);
                    System.out.println("Lowest Marks  : " + lowest);
                    break;

                case 3:
                    System.out.println("Exiting program. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 3);

        sc.close();
   }
}
