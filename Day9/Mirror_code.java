package hundred_days_of_code.Day9;
import java.util.Scanner;

public class Mirror_code{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a lower case string with no spaces: ");

        String a = sc.nextLine();

        String ans = mirror(a);
        System.out.println(ans);


        sc.close();
    }
    static String mirror(String a){
        //adit
        StringBuilder sb = new StringBuilder();

        for(int x = a.length() - 1 ; x >= 0; x--){
            sb.append(a.charAt(x));
        }
        String rev = sb.toString();
        return rev;
    }
}