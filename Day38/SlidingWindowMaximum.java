package hundred_days_of_code.Day38;

import java.util.*;

class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] ans = new int[n - k + 1];

        Deque<Integer> dq = new ArrayDeque<>();

        for (int x = 0; x < n; x++) {

            while (!dq.isEmpty() && dq.peekFirst() <= x - k) {
                dq.pollFirst();
            }

            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[x]) {
                dq.pollLast();
            }

            dq.offerLast(x);

            if (x >= k - 1) {
                ans[x - k + 1] = nums[dq.peekFirst()];
            }
        }

        return ans;
    }
}