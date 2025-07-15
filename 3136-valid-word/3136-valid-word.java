class Solution {
    public boolean isValid(String word) {

        if(word.length()<3) return false;
        boolean hasVowel = false;
        boolean hasConsonant = false;
        char[] ch = word.toCharArray();

        for(char l:ch){
            if(Character.isLetter(l)){
                if(l=='a'|| l=='e'|| l=='i'|| l=='o'|| l=='u'|| l=='A'|| l=='E'|| l=='I'|| l=='O'|| l=='U'){
                hasVowel = true;
            }
            else hasConsonant = true;
            }
            else if(!Character.isDigit(l)) return false;
        }

        return hasVowel && hasConsonant;
    }
}