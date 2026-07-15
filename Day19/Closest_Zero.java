package hundred_days_of_code.Day19;
import java.util.Arrays;

public class Closest_Zero {
    public static void main(String[] args) {
        int[] arr = {1, 60, -10, 70, -80};

        findSum(arr);
    }

    static void findSum(int[] arr) {
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;

        int closest = arr[start] + arr[end];
        int first = arr[start];
        int second = arr[end];

        while (start < end) {
            int sum = arr[start] + arr[end];

            if (Math.abs(sum) < Math.abs(closest)) {
                closest = sum;
                first = arr[start];
                second = arr[end];
            }

            if (sum < 0) {
                start++;
            } else if (sum > 0) {
                end--;
            } else {
                first = arr[start];
                second = arr[end];
                closest = 0;
                break;
            }
        }

        System.out.println(first + " " + second);
    }
}