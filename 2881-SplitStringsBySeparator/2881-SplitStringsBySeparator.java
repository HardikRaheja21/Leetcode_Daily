// Last updated: 2/10/2026, 3:12:09 PM
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();

        String sep = "\\" + separator;

        for(String word : words){
            String[] parts = word.split(sep);

            for(String part : parts){
                if(!part.isEmpty()){
                    result.add(part);
                }
            }
        }
        return result;
    }
}