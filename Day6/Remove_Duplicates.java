package hundred_days_of_code.Day6;
import java.util.Scanner;

public class Remove_Duplicates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of elements inside the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Please enter " +n + " elements in the array: ");
        for(int x = 0; x < arr.length; x++){
            arr[x] = sc.nextInt();
        }
        int k = removeDup(arr, n);
        for(int x = 0; x < k; x++){
            System.out.print(arr[x] + " ");
        }
    
        sc.close();
    }

    public static int removeDup(int[] arr, int n){
        int start = 0;
        int end = 1;
        
        while(end < arr.length){
             if(arr[start] == arr[end]){
                end++;
             }
             else{
                arr[start + 1] = arr[end];
                end++;
                start++;
             }
        }
        return start + 1;
    }
        
}
