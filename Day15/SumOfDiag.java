package hundred_days_of_code.Day15;

public class SumOfDiag {
    public static void main(String[] args) {
        int[][] arr = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    System.out.println(sumDiag(arr));

    }
    static int sumDiag(int[][] arr){
        int sum = 0;
        for(int x = 0; x < arr.length; x++){
            for(int y = 0; y < arr[0].length; y++){
                if(x == y){
                    sum = sum + arr[x][y];
                }
            
        }
        }
        return sum;
    }
    
}
