package hundred_days_of_code.Day85;
import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;

        System.out.println(subarraySum(nums, k));
    }
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int c = 0;
        map.put(0, 1);

        for(int x = 0; x < nums.length; x++){
            sum = sum + nums[x];

            int need = sum - k;
            if(map.containsKey(need)){
                c++;
            }
                map.put(sum, x);
            

        }
    }




    // public static int subarraySum(int[] nums, int k) {
    //     int c = 0;
    //     for(int x = 0; x < nums.length; x++){
    //         int sum = 0;
    //             for(int y = x; y < nums.length; y++){
    //                 sum += nums[y];

    //                 if(sum == k)
    //                     c++;
    //                 }
    //             }
    //             return c;
    //     }
    // }
