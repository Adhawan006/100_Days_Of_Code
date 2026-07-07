package hundred_days_of_code.Day11;
import java.util.Arrays;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4 , 5, 6},
            {7, 8, 9}
        };

        int[][] ans = transpose(matrix);
        System.out.println(Arrays.deepToString(ans));
    }
    public static int[][] transpose(int[][] matrix) {
        
       int[][] ans = new int[matrix[0].length][matrix.length];

    for (int x = 0; x < matrix.length; x++) {
      for (int y = 0; y < matrix[0].length; y++) {
        ans[y][x] = matrix[x][y];
    }
}

return ans;
        
    }
}
