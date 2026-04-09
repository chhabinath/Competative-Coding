class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        List<Integer> firstHalf = new ArrayList<>();
        List<Integer> secondHalf = new ArrayList<>();

        for(int i = 0; i < n; i++){
            firstHalf.add(nums[i]);
            secondHalf.add(nums[i+n]);
        }
        
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < n; i++){
            res.add(firstHalf.get(i));
            res.add(secondHalf.get(i));
        }

        return res.stream().mapToInt(i -> i).toArray();
        
    }
}