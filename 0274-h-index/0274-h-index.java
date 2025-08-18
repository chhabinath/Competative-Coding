class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations); // sort ascending
        int n = citations.length;
        int h = 0;

        for (int i = 0; i < n; i++) {
            int papersWithAtLeast = n - i; // how many papers left including this one
            if (citations[i] >= papersWithAtLeast) {
                h = papersWithAtLeast;
                break;
            }
        }
        return h;
    }
}