//Given a positive integer n, return the 1-based position of its rightmost set bit.
package hundred_days_of_code.Day72;

public class rightmostSet {
    public static void main(String[] args) {
         int bits = 0;
         int n = 14;
         int copy = n;
         //010110

         while(copy>0){
            bits++;
            copy>>=1;
         }
         for(int x = 0; x <= bits; x++){
            if((n & (1 << x)) != 0){
                System.out.println(x + 1);
                break;
            }
         }
}
}
