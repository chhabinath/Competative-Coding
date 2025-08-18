class RandomizedSet {
    private Map<Integer, Integer> map;  // value -> index
    private List<Integer> nums;
    private Random rand;

    public RandomizedSet() {
        map = new HashMap<>();
        nums = new ArrayList<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        nums.add(val);
        map.put(val, nums.size() - 1);
        return true;
    }
    
    public boolean remove(int val) {
         if (!map.containsKey(val)) return false;

        int idx = map.get(val);
        int last = nums.get(nums.size() - 1);

        // Swap with last element
        nums.set(idx, last);
        map.put(last, idx);

        // Remove last element
        nums.remove(nums.size() - 1);
        map.remove(val);

        return true;
    }
    
    public int getRandom() {
         int idx = rand.nextInt(nums.size());
        return nums.get(idx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */