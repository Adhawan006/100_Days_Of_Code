// package hundred_days_of_code.Day8;

// class Solution {
//     public static void main(String[] args) {
//         int n = 15;
//         System.out.println(isPowerOfTwo(n));
//     }
//     public static boolean isPowerOfTwo(int n) {
//         for(int x = 0; x < n; x++){
//             if(Math.pow(2, x) == n){
//                 return true;
//             }

//         }
//         return false;
//     }
// }

package hundred_days_of_code.Day8;

 class Solution {
    public static void main(String[] args) {
         int n = 16;
         System.out.println(isPowerOfTwo(n));
     }
    public static boolean isPowerOfTwo(int n) {
       if(n == 0){
        return false;
       }
       if(n == 1 ){
        return true;
       }
       if(n % 2 != 0){
        return false;
       }

       return isPowerOfTwo(n/2);

    }
}

