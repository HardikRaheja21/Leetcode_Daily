// Last updated: 2/10/2026, 3:16:05 PM
class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;
        if(s.equals(goal)){
            Set<Character> firstTime = new HashSet<>();
            for(char ch : s.toCharArray()){
                if(!firstTime.add(ch)) return true;
            }
            return false;
        }

        List<Integer> swappable = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != goal.charAt(i)){
                swappable.add(i);
            }
        }
        return swappable.size() == 2 &&
            s.charAt(swappable.get(1)) == goal.charAt(swappable.get(0)) &&
            s.charAt(swappable.get(0)) == goal.charAt(swappable.get(1));
    }
}