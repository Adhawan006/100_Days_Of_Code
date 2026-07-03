package hundred_days_of_code.Day7;
import java.util.Scanner;

public class Fibo_Recursive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the nth fibonacci number: ");
        int n = sc.nextInt();

        System.out.println(fibo(n));

        sc.close();
    }
    static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n - 1) + fibo (n - 2);

        //0 1   1 2 3 5 8

    }
}
