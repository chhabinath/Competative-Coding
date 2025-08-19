class Solution {
    public boolean isPalindrome(String s) {
        String ns = s.toLowerCase();
        int i = 0;
        int j = ns.length() - 1;
        while (i < j) {

            while (i < j && !Character.isLetterOrDigit(ns.charAt(i))) {
                i++;
            }

            while (i < j && !Character.isLetterOrDigit(ns.charAt(j))) {
                j--;
            }

            if (ns.charAt(i) != ns.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}