package hundred_days_of_code.Day20;

import java.util.HashMap;

public class SubArray_zero {
    public static void main(String[] args) {
        int[] arr = {1, -1, 2, - 2, 3, -3};

        System.out.println(countSubarray(arr));

    }
    static int countSubarray(int[] arr){

        int prefix = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        for(int x = 0; x < arr.length; x++){
            prefix = prefix + arr[x];
        

        if(map.containsKey(prefix)){
            count = count + map.get(prefix);
        }

        map.put(prefix, map.getOrDefault(prefix, 0) + 1);
    }
    return count;
    }
}
