package hundred_days_of_code.Day69;
import java.util.HashMap;
    class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int x = 0; x < nums.length; x++){
            //[]
            int complement = target - nums[x];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), x};
            }
            else{
                map.put(nums[x], x);
            }
        }
        return new int[] {-1, -1};
        
    }
}
