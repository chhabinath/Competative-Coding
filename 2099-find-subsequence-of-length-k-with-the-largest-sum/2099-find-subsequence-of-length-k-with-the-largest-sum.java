import java.util.*;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[][] pair = new int[n][2];

        // Pair each number with its index
        for (int i = 0; i < n; i++) {
            pair[i][0] = nums[i];
            pair[i][1] = i;
        }

        // Sort by value descending
        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));

        // Take top k elements
        int[][] topK = Arrays.copyOfRange(pair, 0, k);

        // Sort back by index to maintain subsequence order
        Arrays.sort(topK, Comparator.comparingInt(a -> a[1]));

        // Prepare result
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = topK[i][0];
        }

        return res;
    }
}
