// Last updated: 2/10/2026, 3:16:34 PM
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;

        while(i < bits.length - 1){
            if(bits[i] == 1){
                i += 2;
            }
            else{
                i++;
            }
        }
        return i == bits.length - 1;
    }
}