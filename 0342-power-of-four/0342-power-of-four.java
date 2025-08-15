class Solution {
    public boolean isPowerOfFour(int n) {
        return Math.log10(n)/Math.log10(4) - (int)(Math.log10(n)/Math.log10(4)) == 0;
    }
}