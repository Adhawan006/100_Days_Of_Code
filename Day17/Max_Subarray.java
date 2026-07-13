package hundred_days_of_code.Day17;


class Solution {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println((maxSubArray(nums)));
    }
    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for(int x = 1; x < nums.length; x++){
            currentSum = Math.max(nums[x], currentSum + nums[x]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
    

