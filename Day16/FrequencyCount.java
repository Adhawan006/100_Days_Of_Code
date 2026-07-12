package hundred_days_of_code.Day16;
import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1};

        count(arr);
        
    }
    static void count(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();    

    for(int x = 0; x < arr.length; x++){
        map.put(arr[x], map.getOrDefault(arr[x],0) + 1);
    }
     for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + ":" + entry.getValue() + " ");
        }
    
}
}
