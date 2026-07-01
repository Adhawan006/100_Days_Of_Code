package hundred_days_of_code.Day5;
import java.util.Scanner;
import java.util.Arrays;

public class Arrange_Arrival_Logs{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of entries in first log: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];

        System.out.println("Please enter " +n + " values for first log: ");
        for(int x = 0; x < arr1.length; x++){
            arr1[x] = sc.nextInt();
        }

        System.out.println("Please enter the number of entries in second log: ");
        int m = sc.nextInt();

        int[] arr2 = new int[m];

        System.out.println("Please enter " +m+ " values for second log: ");
        for(int x = 0; x < arr2.length; x++){
            arr2[x] = sc.nextInt();
        }
        
        int[] final_log = new int[n + m];
        
        mergedIntervals(arr1, arr2, final_log, n, m);
        System.out.println(Arrays.toString(final_log)); 
  
        sc.close();
    }

    public static void mergedIntervals(int[] arr1, int[] arr2, int[] final_log, int n, int m){
        int start_1 = 0;
        int start_2 = 0;
        int start_3 = 0;

        while(start_1 < arr1.length && start_2 < arr2.length){

            if(arr1[start_1] < arr2[start_2]){
            final_log[start_3] = arr1[start_1];
            start_1++;
            }
        
        else{
            final_log[start_3] = arr2[start_2];
            start_2++;
        }
        start_3++;  
    }
    while(start_1 < arr1.length){
        final_log[start_3] = arr1[start_1];
        start_1++;
        start_3++;
    }
     while(start_2 < arr2.length){
        final_log[start_3] = arr2[start_2];
        start_2++;
        start_3++;
    }
}
}