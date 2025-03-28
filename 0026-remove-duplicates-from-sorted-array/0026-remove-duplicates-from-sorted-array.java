class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
        return 0;

        int j=0;
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[j]!=nums[i]){
                nums[count] = nums[i];
                j=i;
                count++;
            }
        }
        return count;
    }
}