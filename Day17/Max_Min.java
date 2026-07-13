package hundred_days_of_code.Day17;
import java.util.Arrays;

public class Max_Min {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 9, 2, 8};

        System.out.println(Arrays.toString(max_min(arr)));
    }
    static int[] max_min(int[] arr){
        int max = arr[0];
        int min = arr[0];

        for(int x = 0; x < arr.length; x++){
            if(arr[x] > max){
                max = arr[x];
            }
            if(arr[x] < min){
                min = arr[x];
            }
        }
        return new int[]{min, max};
    }

    
}
