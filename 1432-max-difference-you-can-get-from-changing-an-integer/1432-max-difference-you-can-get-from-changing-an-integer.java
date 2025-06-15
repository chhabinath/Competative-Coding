class Solution {
    public int maxDiff(int num) {
        String s1 = Integer.toString(num);
        String s2 = s1;
        int index = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != '9') {
                index = i;
                break;
            }
        }
        s1 = s1.replace(s1.charAt(index), '9');

        for (int i = 0; i < s2.length(); i++) {

            if (i == 0) {
                if (s2.charAt(i) != '1') {
                    s2 = s2.replace(s2.charAt(i), '1');
                    break;
                }
            } else if (s2.charAt(i) != '0' && s2.charAt(i) != s2.charAt(0)) {
                s2 = s2.replace(s2.charAt(i), '0');
                break;
            }
        }

        return Integer.parseInt(s1) - Integer.parseInt(s2);

    }
}