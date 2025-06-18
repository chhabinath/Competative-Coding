public class Solution {
public int[][] divideArray(int[] nums, int k) {
        // Check if the array can be divided into groups of 3
        if (nums.length % 3 != 0) {
            return new int[0][0];
        }

        Arrays.sort(nums); // Sort the array to group close numbers
        int groupCount = nums.length / 3;
        int[][] result = new int[groupCount][3];

        for (int i = 0, groupIndex = 0; i < nums.length; i += 3, groupIndex++) {
            int first = nums[i];
            int second = nums[i + 1];
            int third = nums[i + 2];

            // Check if the current group is valid
            if (third - first > k) {
                return new int[0][0];
            }

            result[groupIndex][0] = first;
            result[groupIndex][1] = second;
            result[groupIndex][2] = third;
        }

        return result;
    }
}