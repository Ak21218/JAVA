import java.util.Scanner;

public class hollowrectangle {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:- ");
        int r = sc.nextInt();

        System.out.print("Enter the number of columes:- ");
        int c = sc.nextInt();

        // outer loop (row)
        for (int i = 1; i <= r; i++) {

            // inner loop (columns)
            for (int j = 1; j <= c; j++) {

                // cell-> (i,j)
                if (i == 1 || j == 1 || i == r || j == c) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
