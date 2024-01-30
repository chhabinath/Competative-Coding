class Solution {
    public int sumBase(int n, int k) {
        int d=0;
        while (n > 0) {
            d += n % k;
            n /= k;
        }
        return d;
    }
}