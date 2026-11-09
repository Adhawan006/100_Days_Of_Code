package hundred_days_of_code.Day83;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution{
public List<List<Integer>> fourSum(int[] nums, int target) {

    Arrays.sort(nums);
        // 1 0  -1 0 -2 2
        List<List<Integer>> list = new ArrayList<>();

        for(int x = 0; x < nums.length; x++){
           for(int y = x + 1; y < nums.length; y++){

            int s = nums[y + 1];
            int e = nums.length - 1;

            if(x > 0 && nums[x] == nums[x-1]){
                continue;
            }
            if (y > x + 1 && nums[y] == nums[y - 1]) {
            continue;
            }
            while(s <= e){
                if(nums[x] + nums[y] + nums[s] + nums[e] == target){
                    list.add(Arrays.asList(x, y, s, e));
                    s++;
                    e--;
                }
            }
            }
            
        }
        return list;
    }
}
