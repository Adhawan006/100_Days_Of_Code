package hundred_days_of_code.Day73;

public class missing {
    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int n = 10;
        int xor_1 = 0;
        int xor_2 = 0;

        for(int x = 0; x <= nums.length; x++){
            xor_1 ^=x;
        }
        for(int x = 0; x < nums.length; x++){
            xor_2^= nums[x];
        }
        System.out.println(xor_1 ^ xor_2);
    }
}
