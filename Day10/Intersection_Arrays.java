package hundred_days_of_code.Day10;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2, 2, 5, 4};

        System.out.println(Arrays.toString(intersect(nums1, nums2)));        
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int num: nums2){
            if(map.containsKey(num) && map.get(num) > 0){
                list.add(num);
                map.put(num, map.get(num)-1);
            }
        }

        int[] ans = new int[list.size()];
        for(int x = 0; x < list.size(); x++){
            ans[x] = list.get(x);
        }
        return ans;

        
    }
    
}