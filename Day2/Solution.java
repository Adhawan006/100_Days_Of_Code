package hundred_days_of_code.Day2;

public class Solution {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;

        for(int x = 0; x<prices.length; x++){
            if(prices[x] < min){
                min = prices[x];
            }
            else{
                int profit = prices[x] - min;
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
   
}

