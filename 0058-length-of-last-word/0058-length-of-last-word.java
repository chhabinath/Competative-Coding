class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();

        int i=s.length()-1;
        String word = "";
        int sp=0;
        while(i>0){
            if(s.charAt(i)==' '){
                break;
            }
            else {
                word+=s.charAt(i);
                sp++;
            }
            i--;
        }
        if(sp==0)
        return s.length();
        return word.length();
    }
}