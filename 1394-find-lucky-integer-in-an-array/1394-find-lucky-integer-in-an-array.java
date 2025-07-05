class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n: arr){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        int r = -1;
        for(int k: map.keySet()){
            if(k == map.get(k)){
                r = Math.max(r,k);
            }
        }
        return r;
    }
}