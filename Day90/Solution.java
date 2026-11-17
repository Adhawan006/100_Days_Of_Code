package hundred_days_of_code.Day90;

class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        
        for(int x = 0; x < nums.length; x++){
           xor = xor ^ nums[x];
        }
        int mask = xor & (-xor);
        
        int g1 = 0;
        int g2 = 0;

        for(int x = 0; x < nums.length; x++){
            if((nums[x] & mask) == 0){
                g1 = g1 ^ nums[x];
            }
            else{
                g2 = g2 ^ nums[x];
            }

        }
        int[] ans = new int[2];
        ans[0] = g1;
        ans[1] = g2;

        return ans;
    }
}
