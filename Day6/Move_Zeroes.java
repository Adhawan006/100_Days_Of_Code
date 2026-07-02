    package hundred_days_of_code.Day6;
    import java.util.Arrays;

    class Move_Zeroes {
        public static void main(String[] args) {
            int[] nums = {0, 1, 0, 3, 12};
            moveZeroes(nums);
            System.out.println(Arrays.toString(nums));
        }
        public static void moveZeroes(int[] nums) {
            int write = 0;
            int read = 0;
            while(read < nums.length){
                if(nums[read] == 0 ){
                    read++;
                }
                else{
                    nums[write] = nums[read];
                    write++;
                    read++;
                }
            }
            while(write < nums.length){
                nums[write] = 0;
                write++;
            }
        }
    }
