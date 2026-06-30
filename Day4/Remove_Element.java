package hundred_days_of_code.Day4;

class Remove_Element {

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        System.out.println(removeElement(nums, val));
        
    }
    public static int removeElement(int[] nums, int val) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            if(nums[start] == val){
                swap(nums, start, end);
                end --;
            }
            else{
                start++;
            }
        }
        return start;
        
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}