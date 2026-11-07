package hundred_days_of_code.Day77;

import java.util.HashSet;

class Solution {

    public int findMaximumXOR(int[] nums) {

        int maxXor = 0;
        int mask = 0;

        for (int bit = 31; bit >= 0; bit--) {

            // Missing semicolon
            mask = mask | (1 << bit);

            HashSet<Integer> prefixes = new HashSet<>();

            // Store prefixes
            for (int x = 0; x < nums.length; x++) {
                prefixes.add(nums[x] & mask);
            }

            // Assume current bit can be 1
            int candidate = maxXor | (1 << bit);

            // HashSet doesn't have length or indexing
            for (int prefix : prefixes) {

                if (prefixes.contains(prefix ^ candidate)) {
                    maxXor = candidate;
                    break;
                }
            }
        }

        return maxXor;
    }
}