public class invertedhalfpyramidwithnumber {
    public static void main(String[] args) {
        int n = 5;

        // outer loop
        for (int i = 5; i >= 1; i--) {

            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }

            System.out.println(" ");

        }
    }

}
