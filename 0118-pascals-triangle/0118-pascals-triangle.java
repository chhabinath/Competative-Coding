class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            if(i>0)
            {
            List<Integer> prev = ans.get(i-1);
            
         
            for(int j = 1; j < i; j++){
                curr.add(prev.get(j-1) + prev.get(j));
             
            }
            curr.add(1);
            }
            ans.add(curr);

        }
        return ans;
    }
}