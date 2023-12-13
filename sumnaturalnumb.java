import java.util.*;

public class sumnaturalnumb {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Number of natural numbers get sum
        System.out.print("Enter the no. of natural numbers: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            System.out.println("sum of n natural numbers are: " +sum);

        }
    }
}
