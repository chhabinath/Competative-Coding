class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int num : nums) {
            s.add(num);
        }
        List<Integer> l = new ArrayList<>(s);
        Collections.sort(l);
        for (int i = 0; i < s.size(); i++) {
            nums[i] = l.get(i);
        }
        return s.size();
    }
}