package hundred_days_of_code.Day3;
import java.util.Scanner;

public class Linear_Comparison_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of your array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Please enter " + n + " elements: ");
        for(int x = 0; x<n; x++){
            arr[x] = sc.nextInt();
        }   

        System.out.println("Please enter the target element to search: ");
        int target = sc.nextInt();
        
        int index = linearSearch(arr, target);
        if(index != -1){
            System.out.println("Element found at index " +index);
        }
        else{
            System.out.println("Not Found");
        }
        System.out.println("Comparisons = "+comparisons(arr, target));

        sc.close();
        
    }

    static int linearSearch(int[] arr, int target){
        for(int x = 0; x<arr.length; x++){
            if(arr[x] == target){
                return x;
            }
        }
     return -1;
    }

    static int comparisons(int[] arr, int target){
        int c = 0;
        for(int x = 0; x<arr.length; x++){
            c++;
            if(arr[x] == target)
                break;
           
        }
        return c;
    }
}
