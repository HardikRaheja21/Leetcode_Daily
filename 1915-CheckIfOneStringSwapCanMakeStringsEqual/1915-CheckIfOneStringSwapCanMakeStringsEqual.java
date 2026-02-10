// Last updated: 2/10/2026, 3:14:06 PM
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        if(s1.equals(s2)) return true;

        List<Integer> swappable = new ArrayList<>();
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                swappable.add(i);
            }
        }
        return swappable.size() == 2 &&
            s1.charAt(swappable.get(0)) == s2.charAt(swappable.get(1)) &&
            s1.charAt(swappable.get(1)) == s2.charAt(swappable.get(0));
    }
}