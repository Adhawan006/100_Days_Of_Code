package hundred_days_of_code.Day12;
import java.util.Scanner;

public class Symmetric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of rows and columns: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] nums = new int[n][m];

        System.out.println("Please enter the elements of matrix: ");
        for(int x = 0; x < nums.length; x++){
            for(int y = 0; y < nums[0].length; y++){
                nums[x][y] = sc.nextInt();
            }      
        }
        sc.close();

        checkSym(nums, n, m);

        
    }

    static void checkSym(int[][] nums, int n, int m){
        if(n != m){
            System.out.println("Not a Symmetrix Matrix");
            return;
        }

        for(int x = 0; x < nums.length; x++){
            for(int y = 0; y < nums[0].length; y++){
                if(nums[x][y] != nums[y][x]){
                    System.out.println("Not a Symmetric Matrix");
                    return;
                }
            }      
        }
        System.out.println("Symmetrix Matrix");
        

    }
}
