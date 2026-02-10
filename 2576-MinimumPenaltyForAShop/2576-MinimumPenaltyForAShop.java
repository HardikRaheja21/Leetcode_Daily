// Last updated: 2/10/2026, 3:12:50 PM
class Solution {
    public int bestClosingTime(String customers) {
        int profit = 0;
        int maxProfit = 0;
        int bestHour = 0;
        for(int i = 0; i < customers.length(); i++){
            if(customers.charAt(i) == 'Y') profit++;
            else profit--;
            if(profit > maxProfit){
                maxProfit = profit;
                bestHour = i + 1;
            }
        }
        return bestHour;
    }
}