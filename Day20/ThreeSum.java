package hundred_days_of_code.Day20;
import java.util.*;
import java.util.Arrays;

import java.util.List;

class Solution {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};

        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();

        
        for(int x = 0; x < nums.length - 2; x++){

          if (x > 0 && nums[x] == nums[x - 1]) {
                continue;
            }

            int left = x + 1;
            int right = nums.length - 1;
        
        while(left < right){
            int sum = nums[x] + nums[left] + nums[right];

            if(sum < 0){
                left++;
            }
            if(sum > 0){
                right--;
            }
            if(sum == 0){
                list.add(Arrays.asList(nums[x], nums[left], nums[right]));

                left++;
                right--;

        while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

        while (left < right && nums[right] == nums[right + 1]) {
                        right--;

            }

        }
    }
        
    }
    return list;
}
}
