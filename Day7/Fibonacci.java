package hundred_days_of_code.Day7;

public class Fibonacci{
    public static void main(String[] args) {

        System.out.println(fibo(4));

    }
    static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n - 1) + fibo (n - 2);

        //0 1   1 2 3 5 8

    }
}
