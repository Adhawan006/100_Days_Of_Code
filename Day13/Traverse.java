package hundred_days_of_code.Day13;

public class Traverse {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        traverse(matrix);
    }

    static void traverse(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            for (int x = left; x <= right; x++) {
                System.out.print(matrix[top][x] + " ");
            }
            top++;

            for (int x = top; x <= bottom; x++) {
                System.out.print(matrix[x][right] + " ");
            }
            right--;

            if (top <= bottom) {
                for (int x = right; x >= left; x--) {
                    System.out.print(matrix[bottom][x] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                for (int x = bottom; x >= top; x--) {
                    System.out.print(matrix[x][left] + " ");
                }
                left++;
            }
        }
    }
}