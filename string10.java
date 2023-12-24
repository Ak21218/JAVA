import java.util.*;

public class string10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String c = "I study at SIT";

        String strAr[] = c.split(" ");
        for (int i = 0; i < strAr.length; i++)
            System.out.print(strAr[i] + " ");
        char chAr[] = c.toCharArray();
        System.out.println();

        for (int i = 0; i < chAr.length; i++)
            System.out.print(chAr[i] + ",");
        System.out.println();
        
        System.out.println(c.trim());
        sc.close();


    }

}
