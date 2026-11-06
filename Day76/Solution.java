class Solution {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(countPrimes(n));
    }
    public static int countPrimes(int n) {

        if(n <= 2){
            return 0;
        }
        
        int c = 0;

        boolean[] isPrime = new boolean[n];

        for(int x = 0; x < isPrime.length; x++){
               isPrime[x] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;

        for(int x = 2; x*x < n; x++){
            if(isPrime[x]){
                for(int y = x * x; y < n; y = y + x){
                    isPrime[y] = false;
                }
            }

        }
        for(int x = 2; x < isPrime.length; x++){
            if(isPrime[x]){
                c++;
            }
        }
        return c;
    }
}