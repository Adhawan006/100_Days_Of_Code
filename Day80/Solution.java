package hundred_days_of_code.Day80;

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
       
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int x = 0; x < rows - 1; x++){
            int s = 0;
            int e = cols - 1;

            while(s <= e){
                int mid = s + (e - s) / 2;

                if(matrix[x][mid] == target){
                    return true;
                }
                if(target > matrix[x][mid]){
                    s++;
                }
                else{
                    e--;
                }
            }
        }
        return false;
}
}
