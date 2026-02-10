// Last updated: 2/10/2026, 3:17:41 PM
class Solution {
    public String getHint(String secret, String guess) {
        int bull = 0, cow = 0;
        int[] secretfreq = new int[10];
        int[] guessfreq = new int[10];
        for(int i = 0; i < secret.length(); i++){
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if(s == g) bull++;
            else {
                secretfreq[s - '0']++;
                guessfreq[g - '0']++;
            }
        }
        for(int i = 0; i < 10; i++){
            cow += Math.min(secretfreq[i], guessfreq[i]);
        }
        return "" + bull + "A" + cow + "B";
    }
}