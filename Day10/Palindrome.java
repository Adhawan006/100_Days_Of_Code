package hundred_days_of_code.Day10;
import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String s = sc.nextLine();

        System.out.println(checkPal(s));
        
        sc.close();
    }
    static boolean checkPal(String s){
        StringBuilder newS = new StringBuilder();

        for(int x = s.length() - 1; x >= 0; x--){
            newS.append(s.charAt(x));
        }

        if(newS.toString().equals(s)){
            return true;
        }
        return false;

    }
}