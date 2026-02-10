// Last updated: 2/10/2026, 3:12:08 PM
class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder acronym = new StringBuilder();

        for(String word : words){
            acronym.append(word.charAt(0));
        }

        return acronym.toString().equals(s);
    }
}