class Solution {
    public String capitalizeTitle(String title) {
        title = title.toLowerCase();
        String words[] = title.split(" "); 
        String capTitle = "";
        for(String word: words){
            if(word.length() > 2){
               capTitle = capTitle + Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
            }
            else{
                capTitle = capTitle + word+ " ";
            }
        }
        return capTitle.trim();
    }
}