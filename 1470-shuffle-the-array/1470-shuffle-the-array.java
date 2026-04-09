class Solution {
    public int[] shuffle(int[] nums, int n) {
   
        int res[] = new int[2*n];
        int index = 0;
        for(int i = 0; i < 2*n; i+=2){
            res[i] = nums[index];
            res[i+1]= nums[index+n];
            index++;
        }

        return res;
        
    }
}