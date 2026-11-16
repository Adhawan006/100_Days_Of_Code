    package hundred_days_of_code.Day88;

    class Solution {
        public static void main(String[] args) {
            int[] nums = {1, 1, 2, 2, 3};
            System.out.println(removeDuplicates(nums));
        }
        public static int removeDuplicates(int[] nums) {
            int n = nums.length;
            int s = 0;
            int e = 1;
              while(e < n){
                if(nums[s] != nums[e]){
                    s++;
                    nums[s] = nums[e];
                }
                    e++;
            }
            return s +1;

        }
    }
