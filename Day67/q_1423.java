package hundred_days_of_code.Day67;

public class q_1423 {
    public static void main(String[] args) {
        
    }
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;

        for(int x = 0; x < k; x ++){
            sum = sum + cardPoints[k];
        }

        int max = sum;

        int left = k - 1;
        int right = cardPoints.length - 1;

        while(left >= 0){
            sum = sum - cardPoints[left];
            sum = sum + cardPoints[right];

            max = Math.max(max, sum);

            left--;
            right--;
        }
return max;

    }
    
}
