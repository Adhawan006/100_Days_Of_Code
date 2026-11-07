package hundred_days_of_code.Day78;
import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        while(top <= bottom && left <=right){
        for(int x = left; x <= right; x++){
            list.add(matrix[top][x]);
        }
        top++;
        if(top > bottom)
            break;

        for(int x = top; x <= bottom; x++){
            list.add(matrix[x][right]);
        }
        right--;
        if(left > right)
            break;

        for(int x = right; x >= left; x--){
            list.add(matrix[bottom][x]);
        }
        bottom--;
        if(top > bottom)
            break;

        for(int x = bottom; x >= top; x--){
            list.add(matrix[x][left]);
        }
        left++;
        if(left > right)
            break;
    }
    return list;
}
}