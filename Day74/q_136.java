package hundred_days_of_code.Day74;

public class q_136 {
    public static void main(String[] args) {
    
    int[] nums = {4, 1, 2, 1, 2};
    int ans = 0;

    for(int x = 0; x < nums.length; x++){
        ans = ans ^ nums[x];
    }
    System.out.println(ans);
}
}