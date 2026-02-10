// Last updated: 2/10/2026, 3:11:58 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < words.length; i++){
            if(words[i].indexOf(x) != -1){
                result.add(i);
            }
        }
        return result;
    }
}