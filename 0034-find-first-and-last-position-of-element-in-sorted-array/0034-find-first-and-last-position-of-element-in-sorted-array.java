class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first = 0;
        int last = nums.length - 1;
        int mid;
        int i = -1;
        int j = -1;

        while (first <= last) {
            mid = first + (last - first) / 2;
            if (nums[mid] == target) {

                i = mid;
                j = mid;

                while (i > 0 && nums[i - 1] == target) {
                    i--;
                }

                while (j < nums.length - 1 && nums[j + 1] == target) {
                    j++;
                }

                break;

            }else if (nums[mid] < target) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return new int[] { i, j };
    }
}