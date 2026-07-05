package hundred_days_of_code.Day9;
import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        char[] s = {'a', 'd', 'i', 't'};

        System.out.println(Arrays.toString(reverseString(s)));
    }
    public static char[] reverseString(char[] s) {
       int start = 0;
       int end = s.length - 1;


        while(start < end){
            swap(s, start, end);
            start++;
            end--;
        }
        return s;
    }
    static void swap(char[] s, int first, int second){
        char temp = s[first];
        s[first] = s[second];
        s[second] = temp;

    }

}
