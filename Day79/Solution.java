class Solution {
    public int[][] generateMatrix(int n) {

        int num = 1;
        int[][] matrix = new int[n][n];

        int rows = matrix.length;
        int cols = matrix[0].length;

        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        while(top <= bottom && left <=right){

        for(int x = left; x <= right; x++){
            matrix[top][x] = num++;
        }
        top++;
        if(top > bottom)
            break;

        for(int x = top; x <= bottom; x++){
            matrix[x][right] = num++;
        }
        right--;
        if(left > right)
            break;

        for(int x = right; x >= left; x--){
            matrix[bottom][x] = num++;
        }
        bottom--;
        if(top > bottom)
            break;

        for(int x = bottom; x >= top; x--){
            matrix[x][left] = num++;
        }
        left++;
        if(left > right)
            break;
    }
    return matrix;
}
    }
