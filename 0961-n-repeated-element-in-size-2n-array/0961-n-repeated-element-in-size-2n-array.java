class Solution {
    public int repeatedNTimes(int[] nums) {
        int count;
        for(int i = 0; i < nums.length; i++){
            count = 0;
            for(int j = 0; j < nums.length; j++){
                // System.out.println(j);
                if(nums[i] == nums[j])
                count ++;
            }
            // System.out.println(nums[i]+" = "+count);
            if(count > 1)
            return nums[i];
            
        }
        return 1;
    }
}