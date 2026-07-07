package hundred_days_of_code.Day11;
import java.util.Scanner;
import java.util.Arrays;

public class Matrix_Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number of rows and columns: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] m1 = new int[m][n];
        int[][] m2 = new int[m][n];

        System.out.println("Please enter elements for matrix 1: ");
        for(int x = 0; x < m; x++){
            for(int y = 0; y < n; y++){
                m1[x][y] = sc.nextInt();
            }
        }
        System.out.println("Please enter elements for matrix 1: ");

        for(int x = 0; x < m; x++){
            for(int y = 0; y < n; y++){
                m2[x][y] = sc.nextInt();
            }
        }

        int[][] ans = sum(m1, m2, m, n);

        for(int x = 0; x < m; x++){
            for(int y = 0; y < n; y++){
                System.out.print( ans[x][y] + " ");
            }
            System.out.println();
        }
    

        sc.close();
        
    }
    static int[][] sum(int[][] m1, int[][] m2, int m, int n){

         // 1 2 3   9 8 7    
         // 4 5 6   6 5 4
         // 7 8 9   3 2 1


         for(int x = 0; x < m; x++){
            for(int y = 0; y < n; y++){
                m1[x][y] = m1[x][y] + m2[x][y];
            }

         }
         return m1;

    }
}
