package hundred_days_of_code.Day86;
import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;

        System.out.println(subarraysDivByK(nums, k));
    }
    public static int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int c = 0;
        map.put(0, 1);

        for(int x = 0 ; x < nums.length; x++){
            sum = sum + nums[x];
            int remainder = sum % k;
            if(map.containsKey(remainder)){
                c = c + map.get(remainder);
            }
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }
        return c;
    }
}