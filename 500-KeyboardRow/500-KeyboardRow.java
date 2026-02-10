// Last updated: 2/10/2026, 3:16:52 PM
class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> result = new ArrayList<>();

        for(String word : words){
            String lowerWord = word.toLowerCase();
            if(belongsToOneRow(lowerWord, row1) || belongsToOneRow(lowerWord, row2) || belongsToOneRow(lowerWord, row3)){
                result.add(word);
            }        
        }
        return result.toArray(new String[0]);
    }

    private boolean belongsToOneRow(String word, String row){
        for(char c : word.toCharArray()){
            if(row.indexOf (c) == -1){
                return false;
            }
        }
        return true;
    }
}