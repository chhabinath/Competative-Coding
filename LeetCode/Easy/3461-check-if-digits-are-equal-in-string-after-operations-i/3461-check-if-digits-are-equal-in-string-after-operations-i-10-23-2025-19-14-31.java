class Solution {
    public boolean hasSameDigits(String s) {
        char[] ch = s.toCharArray();
        for (int i = 1; i <= ch.length - 2; i++) {
            for (int j = 0; j <= ch.length - 1 - i; j++) {
                int d1 = ch[j]-'0';
                int d2 = ch[j+1]-'0';
                ch[j] = (char)(((d1+d2)%10)+'0');
            }
        }

        return ch[0] == ch[1];
    }
}