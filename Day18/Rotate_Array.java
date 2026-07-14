package hundred_days_of_code.Day18;
import java.util.Arrays;

public class Rotate_Array {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

       rotateArray(arr, k);
       System.out.println(Arrays.toString(arr));
    }
    static void rotateArray(int[] arr, int k){
        int n = arr.length;
        k = k % n;

          reverse(arr, 0, n - 1);
          reverse(arr, 0, k - 1);
          reverse(arr, k, n - 1);

    }
    static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    
}
