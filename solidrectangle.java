import java.util.*;

public class solidrectangle {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:- ");
        int r = sc.nextInt();

        System.out.print("Enter the number of columes:- ");
        int c = sc.nextInt();
        // outer loop (rows)
        for (int i = 1; i <= r; i++) {
            // inner loop (columns)
            for (int j = 1; j <= c; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
