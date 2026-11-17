package hundred_days_of_code.Day89;
import java.util.HashMap;

class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int[] newArr = new int[n];
        int index = 0;

        for(int x : nums){
            map.put(x, map.getOrDefault(x , 0) + 1);
        }
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                newArr[index] = key;
                index++;
            }
        }
        return newArr;
        }
    }

