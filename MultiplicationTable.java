import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
    
        // Get input from the user
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        // Get the range for the multiplication table
        System.out.print("Enter the range: ");
        int r = scanner.nextInt();

        // Print the multiplication table
        System.out.println("Multiplication Table for: "+n);
        for (int i = 1; i <= r; i++) {
            System.out.println(n + "x" + r + "=" + (n * i));
        }
    }
}

