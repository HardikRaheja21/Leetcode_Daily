// Last updated: 2/10/2026, 3:19:02 PM
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2 || prices == null){
            return 0;
        }
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;
        for(int price : prices){
            if(price < minPrice) minPrice = price;
            else if(price - minPrice > maxPrice) maxPrice = price - minPrice;
        }
        return maxPrice;
    }
}