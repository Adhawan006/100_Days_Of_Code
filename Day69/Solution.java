package hundred_days_of_code.Day69;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 18;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        for(int x=0; x<nums.length; x++){
            for(int y = x + 1; y < nums.length; y++){
                if(nums[x] + nums[y] == target){
                    return new int[] {x, y};
                }
            }
        }
        return new int[] {-1, -1};
    }
}