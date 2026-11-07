package hundred_days_of_code.Day81;

class Solution {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7 ,8, 9},
        };

        System.out.println(searchMatrix(matrix, 5));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
       
        int row = 0;
        int cols = matrix[0].length - 1;

        while (row < matrix.length && cols >= 0){
            int current = matrix[row][cols];

            if(current == target){
                return true;
            }
            else if(current > target){
                cols--;
            }
            else{
                row++;
            }
        }
        return false;
       
}
}

