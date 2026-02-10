// Last updated: 2/10/2026, 3:13:37 PM
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        int i = 0;
        while(tickets[k] > 0){
            if(tickets[i] > 0){
                tickets[i]--;
                time++;
            }
            i = (i + 1) % tickets.length;
        }
        return time;
    }
}