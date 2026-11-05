package hundred_days_of_code.Day71;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        
        Arrays.sort(nums);

        for(int x = 0; x < nums.length - 2; x++){

            if (x > 0 && nums[x] == nums[x - 1]) {
                continue;
            }
            
            int s = x+1;
            int e = nums.length - 1;

            while(s < e){
                int sum = nums[x] + nums[s] + nums[e];

                if(sum == 0){
                    list.add(Arrays.asList(nums[x], nums[s], nums[e]));
                    s++;
                    e--;
                    while (s < e && nums[s] == nums[s - 1]) {
                        s++;
                    }
                    while (s < e && nums[e] == nums[e + 1]) {
                        e--;
                    }
                }
                else{
                if(sum < 0){
                    s++;
                }
                else{
                    e--;
                }
            }
            }
        }
        return list;
    }
}
