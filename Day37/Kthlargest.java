package hundred_days_of_code.Day37;
import java.util.PriorityQueue;

class KthLargest {
   
    private PriorityQueue<Integer> minHeap;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();

        for(int x = 0; x < nums.length; x++){
            add(nums[x]);
        }
    }

    // k = 3
    // {4, 5, 8, 2}
    
    public int add(int val) {
        minHeap.offer(val);

        if(minHeap.size() > k){
           minHeap.poll();
        }
        return minHeap.peek();
        
    }
}

