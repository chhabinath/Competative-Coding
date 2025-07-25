class Solution {
    public int maxSum(int[] nums) {
        if(nums.length == 1) return nums[0];
        Set<Integer> n1 = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for(int arr: nums){
            if(arr>0)
                n1.add(arr);
            else
                if(arr > max)
                    max = arr;
        }
        int res = 0;
        for(int un:n1)
            res+=un;
            if(res==0)
                return max;
        return res;
    }
}