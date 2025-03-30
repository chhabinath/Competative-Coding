class Solution {
    public boolean wordPattern(String pattern, String s) {
        char ch[] = pattern.toCharArray();
        String str[]=s.split(" ");
        
        if(ch.length!=str.length) return false;

        for(int i=0;i<str.length;i++){
            for(int j=1;j<ch.length;j++){
                if(!str[i].equals(str[j]) && ch[i]==ch[j]){
                    return false;
                }
                if(str[i].equals(str[j]) && ch[i]!=ch[j]){
                    return false;
                }
            }
        }
        return true;    
    }
}