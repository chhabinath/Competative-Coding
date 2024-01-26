class Solution {
    public int[] findRightInterval(int[][] intervals) {

        int ans[] = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            int minStart = Integer.MAX_VALUE;
            int index = -1;

            for (int j = 0; j < intervals.length; j++) {
                if (intervals[j][0] >= intervals[i][1] && minStart > intervals[j][0]) {
                    minStart = intervals[j][0];
                    index = j;
                }
            }
            ans[i] = index;
        }
        return ans;
    }
}