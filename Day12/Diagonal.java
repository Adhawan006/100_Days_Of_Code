package hundred_days_of_code.Day12;

class Solution {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 1, 2, 3},
            {9, 5, 1, 2}
        };
        System.out.println(isToeplitzMatrix(matrix));
        
    }
    public static boolean isToeplitzMatrix(int[][] matrix) {
        for(int x = 0; x < matrix.length - 1; x++){
            for(int y = 0; y < matrix[0].length - 1; y++){
                if(matrix[x][y] != matrix[x+1][y+1]){
                    return false;
                }

            }
        }
        return true;
        
    }
}
