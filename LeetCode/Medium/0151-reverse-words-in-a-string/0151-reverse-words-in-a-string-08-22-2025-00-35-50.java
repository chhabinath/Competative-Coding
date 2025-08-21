class Solution {
    public String reverseWords(String s) {
        s=s+" ";
        String word="";
        String result="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                word+=s.charAt(i);

            }
            else{
                if(!(word.isEmpty()))
                {
                    result=word+" "+result;
                    word="";
                }
            }
        }
        return result.trim();
    }
}