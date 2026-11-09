package hundred_days_of_code.Day84;

// class Solution {
//     public static void main(String[] args) {
//         int[] nums = {100, 4, 200, 1, 3, 2};

//         System.out.println(longestConsecutive(nums));
//     }
//     public static int longestConsecutive(int[] nums) {
//         // 100, 4, 200, 1, 3 , 2
//         int max = 0;

//         for(int x = 0; x < nums.length; x++){
//             int current = nums[x];
//             int current_length = 1;
    

//             while(exists(nums, current + 1)){ 
//                 current_length ++;
//                 current++;


//         if(current_length > max){
//             max = current_length;
//         }

//             }
//         }
//       return max;

//     }
//     public static boolean exists(int[] nums, int n){
//         for(int x = 0; x < nums.length; x++){
//             if(nums[x] == n){
//                 return true;
//             }
//         }
//         return false;
//     }
// }

import java.util.*;

class Solution {
    public static void main(String[] args) {
      int[] nums = {100, 4, 200, 1, 3, 2};

         System.out.println(longestConsecutive(nums));
     }
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0;

        for(int x = 0; x < nums.length; x++){
            set.add(nums[x]);
        }

        for(int x = 0; x < nums.length; x++){
            
            int current = nums[x];
            int current_length = 1;
            
            if(!set.contains(nums[x] - 1)){
                while(set.contains(current + 1)){
                    current_length++;
                    current++;
                }
            }
                if(current_length > max)
                    max = current_length;
                
            
            else{
                continue;
            }
        }
        return max;
}

    }

