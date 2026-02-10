// Last updated: 2/10/2026, 3:14:08 PM
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index;

        if(ruleKey.equals("type")){
            index = 0;
        }      
        else if(ruleKey.equals("color")){
            index = 1;
        }
        else{
            index = 2;
        }
        int count = 0;

        for(List<String> item : items){
            if(item.get(index).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}