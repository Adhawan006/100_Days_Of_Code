package hundred_days_of_code.Day4;
import java.util.Scanner;
import java.util.Arrays;

public class Array_Reversal{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Please enter " + n + " element in the array: ");
        for(int x = 0; x < arr.length; x++){
            arr[x] = sc.nextInt();
        }
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

        sc.close();
        
    }
    static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }

    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}