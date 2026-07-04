package hundred_days_of_code.Day8;
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter number and power: ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(power(a, b));

        sc.close();
    }
    static int power(int a, int b){
        if(b == 0){
            return 1;
        }
        
        return a * power(a, b - 1);
    }
}
