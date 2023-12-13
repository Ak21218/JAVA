import java.util.Scanner;

public class important {
    public static void evaluateMarks(double marks) {
        if (marks >= 90) {
            System.out.println("This is Good");
        } else if (marks >= 60 && marks <= 89) {
            System.out.println("This is also Good");
        } else if (marks >= 0 && marks <= 59) {
            System.out.println("This is Good as well");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu: ");
            System.out.println("1.Enter student's marks: ");
            System.out.println("0.Quit: ");

            System.out.print("Enter your choice (1 or 0): ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                try {
                    System.out.print("Enter student's marks (out of 100): ");
                    double marks = scanner.nextDouble();

                    if (marks >= 0 && marks <= 100) {
                        evaluateMarks(marks);
                    } else {
                        System.out.println("Invalid input! Marks should be between 0 and 100.");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    scanner.nextLine(); // Clear the buffer
                }
            } else if (choice == 0) {
                System.out.println("Program terminated.");
                break;
            } else {
                System.out.println("Invalid choice! Please enter 1 or 0.");
            }
        }

        scanner.close();
    }
}