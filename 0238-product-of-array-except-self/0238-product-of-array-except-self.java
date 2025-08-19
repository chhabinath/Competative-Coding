class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        int totalPro = 1;
        int zeroCount = 0;

        // Step 1: Calculate product of non-zero elements & count zeros
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                totalPro *= num;
            }
        }

        // Step 2: Handle cases based on zero count
        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                arr[i] = 0; // more than one zero → all products are zero
            } else if (zeroCount == 1) {
                arr[i] = (nums[i] == 0) ? totalPro : 0; // only zero index gets product
            } else {
                arr[i] = totalPro / nums[i]; // no zeros → safe to divide
            }
        }

        return arr;
    }
}