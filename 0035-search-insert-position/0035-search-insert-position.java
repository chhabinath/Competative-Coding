class Solution {
    public int searchInsert(int[] nums, int target) {

        int first = 0;
        int last = nums.length - 1;
        int mid;

        while (first <= last) {
            mid = (first + last) / 2;
            if (nums[mid] < target)
                first = mid + 1;
            else
                last = mid - 1;
        }
        return first;
    }
}