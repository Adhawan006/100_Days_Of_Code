package hundred_days_of_code.Day14;

public class Identity{
    public static void main(String[] args) {
        int[][] nums = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}

        };
        System.out.println(checkIden(nums));
    }
    static boolean checkIden(int[][] nums){

        if (nums.length != nums[0].length) {
          return false;
        }

        for(int x = 0; x < nums.length; x++){
            for(int y = 0; y < nums[0].length; y++){
                if(x == y){
                    if(nums[x][y] != 1){
                        return false;
                    }
                }
                else if(x != y){
                    if(nums[x][y] != 0){
                        return false;
                    }
                }


            }
        }
        return true;
    }
}