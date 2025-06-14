class Solution {
    public int minMaxDifference(int num) {
        
        String s = Integer.toString(num);
        String s2 = s;
        int index = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '9'){
                index = i;
                break;
            }
        }

        s = s.replace(s.charAt(index),'9');

        s2 = s2.replace(s2.charAt(0),'0');

        return Integer.parseInt(s) - Integer.parseInt(s2);
        
    }
}