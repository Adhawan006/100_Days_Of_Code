package hundred_days_of_code.Day5;
import java.util.Arrays;

public class Merge_Sorted_Array {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
        
    }
    static void merge(int[] nums1, int m, int[] nums2, int n){
        int start = m - 1;
        int start_2 = n - 1;
        int k = m + n - 1;
        while(start >= 0 && start_2 >= 0){
            if(nums1[start] > nums2[start_2]){
                nums1[k] = nums1[start];
                start--;
            }
            else{
                nums1[k] = nums2[start_2];
                start_2--;
        }
            k--;
        }
        while (start_2 >= 0) {
    nums1[k] = nums2[start_2];
    start_2--;
    k--;
}
    }
 
}

