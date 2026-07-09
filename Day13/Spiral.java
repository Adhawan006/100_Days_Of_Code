package hundred_days_of_code.Day13;
import java.util.*;

public class Spiral {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(spiralOrder(matrix));
    }
public static List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> list = new ArrayList<>();

    int top = 0;
    int bottom = matrix.length - 1;
    int left = 0;
    int right = matrix[0].length - 1;

    while(top <= bottom && left <= right){

    for(int x = left; x <= right; x++){
        list.add(matrix[top][x]);
    }
    top++;
    
    for(int x = top; x<= bottom; x++){
        list.add(matrix[x][right]);
    }
    right--;

    if(top <= bottom){

    for(int x = right; x >= left; x--){
        list.add(matrix[bottom][x]);
    }
    bottom--;
}
    

    if (left <= right) {
                for (int x = bottom; x >= top; x--) {
                    list.add(matrix[x][left]);
                }
                left++;
         }
        }
         return list;
        
    }
    
}
