class Solution {
    public void rotate(int[] nums, int k) {
        
        k=k%nums.length;
        reverse(nums,0,nums.length-1);// reverse all
        reverse(nums,0,k-1);//reverse till kth position
        reverse(nums, k,nums.length-1);// reverse after kth position
        
        
    }
    public void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}