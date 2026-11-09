package hundred_days_of_code.Day82;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1};

        System.out.println(Arrays.toString(sortArray(nums)));

    }
    public static int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    public static void mergeSort(int[] nums, int start, int end){
        if(start >= end){
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(nums, start , mid);
        mergeSort(nums, mid+1, end);

       int[] temp = new int[end - start + 1];

       int i = start;
       int j = mid + 1;
       int k = 0;

       while(i <= mid && j <= end){
        if(nums[i] <= nums[j]){
            temp[k] = nums[i];
            i++;
        }
        else{
            temp[k] = nums[j];
            j++;
        }
        k++;
       }
       //remaining
       while(i <= mid){
        temp[k] = nums[i];
        k++;
        i++;
       }
       while(j <= end){
        temp[k] = nums[j];
        k++;
        j++;
       }

       for(int x = 0; x < temp.length; x++){
        nums[start + x] = temp[x];
       }
        }
    }

