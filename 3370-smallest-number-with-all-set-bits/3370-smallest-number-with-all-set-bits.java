class Solution {
    public int smallestNumber(int n) {
        int m = n;
        String bs = Integer.toBinaryString(m);
        char[] ch = bs.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == '0')
            ch[i]='1';
        }
        String nbs = new String(ch);
        return Integer.parseInt(nbs,2);
    }
}