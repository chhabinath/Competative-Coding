class Solution {
    public String makeFancyString(String s) {
        char ch[] = s.toCharArray();
        int c = 0;
        int i = 0;
        int j = 1;
        int k = 2;
        String res = "";
        while(k < ch.length){
            if(ch[c] != '\u0000')
                res += ch[c];
            c++;
          if(ch[i] == ch[j] && ch[j] == ch[k]){
            ch[k] = '\u0000';
          }
          if(ch[j] != '\u0000'){
            i = j;
          }
          if(ch[k] != '\u0000'){
            j = k;
          }
          k++;

        }

        // for(char c : ch)
        //     if(c != '\u0000')
        //         res += c;
        System.out.println(c);
        if(ch[c] != '\u0000')
        return res + ch[c] + ch[c+1] ;
        return res;
    }
}