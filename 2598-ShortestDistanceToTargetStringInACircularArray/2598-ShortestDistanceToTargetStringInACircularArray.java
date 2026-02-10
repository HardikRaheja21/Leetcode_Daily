// Last updated: 2/10/2026, 3:12:44 PM
class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int minDistance = Integer.MAX_VALUE;
        boolean found = false;

        for(int i = 0; i < n; i++){
            if(words[i].equals(target)){
                found = true;

                int forwardDistance = (i - startIndex + n) % n;
                int backwardDistance = (startIndex - i + n) % n;
                int currentDistance = Math.min(forwardDistance, backwardDistance);
                minDistance = Math.min(minDistance, currentDistance);
            }
        }
        return found ? minDistance : -1;
    }
}