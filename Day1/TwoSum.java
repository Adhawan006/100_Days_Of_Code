//TwoSum problem (optimized) using HashMap
//https://100-days-of-dsa.vercel.app/

package hundred_days_of_code.Day1;
import java.util.HashMap;




public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 26;

        int[] ans = twoSum(nums, target);
        System.out.println(ans[0] + " " + ans[1]);

    }
            
    
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int x = 0; x<nums.length; x++){
            int complement = target - nums[x];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), x};
            }
            map.put(nums[x], x);

        }
        return new int[]{-1, -1};
        
    }
    }

