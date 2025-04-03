class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length())
            return -1;
        for(int i=0;i<haystack.length();i++){
            for(int j=i+1;j<=haystack.length();j++){
               String subStr= haystack.substring(i,j);
            //    System.out.println(subStr);
            if(subStr.equals(needle))
                return i;
            }
        }
       return -1; 
    }
}