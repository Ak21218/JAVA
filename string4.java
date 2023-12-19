//Ingnore lower and upper case
public class string4 {
    public static void main(String[] args) {


        String a = "tONY";
        String b = "Tony";

        if (a.equalsIgnoreCase(b) == true)
            System.out.println("Both are same");
        else
            System.out.println("Not same");
    }
}
