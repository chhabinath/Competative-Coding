class Solution {
    public int lengthOfLastWord(String s) {

        s=s.trim();
        s=" "+s;
        int c=0;
        for(int i=s.length()-1;i>0;i--){
            if(s.charAt(i) == ' ')
                break;
            else
                c++;
        }
        return c;
        
    }
}