package Leet_Ques;

class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] newArr = new int[n];
        int sum = 0;

        for(int x = 0; x < n; x++){
            sum = sum + nums[x];
            newArr[x] = sum;
        }
        return newArr;
    }
}