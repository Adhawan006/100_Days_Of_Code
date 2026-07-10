package hundred_days_of_code.Day14;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
    }

    public static void rotate(int[][] matrix) {
        transpose(matrix);
        reverseRows(matrix);
    }

   static void transpose(int[][] matrix) {
    int n = matrix.length;

    for (int x = 0; x < n; x++) {
        for (int y = x + 1; y < n; y++) {

            int temp = matrix[x][y];
            matrix[x][y] = matrix[y][x];
            matrix[y][x] = temp;

        }
    }
}
static void reverseRows(int[][] matrix) {

    for (int x = 0; x < matrix.length; x++) {

        int start = 0;
        int end = matrix[0].length - 1;

        while (start < end) {

            int temp = matrix[x][start];
            matrix[x][start] = matrix[x][end];
            matrix[x][end] = temp;

            start++;
            end--;
        }
    }
}

}
    
