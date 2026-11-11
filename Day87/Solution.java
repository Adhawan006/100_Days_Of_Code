package hundred_days_of_code.Day87;

class Solution {
    public static void main(String[] args) {

    int[] nums = {3, 4, 5, 1, 2};
    System.out.println(findMin(nums));
}
    public static int findMin(int[] nums) {
        int s = 0;
        int e = nums.length - 1;

        while(s <= e){
        int mid = s + (e - s ) / 2;
        
        if(mid < e && nums[mid] > nums[mid + 1]){
            return nums[mid+1];
        }
        else if(mid > s && nums[mid - 1] > nums[mid]){
            return nums[mid];
        }
        if(nums[s] <= nums[mid]){
            s = mid + 1;
        }
        else{
            e = mid - 1;
        }
    }
    return -1;
}
}
