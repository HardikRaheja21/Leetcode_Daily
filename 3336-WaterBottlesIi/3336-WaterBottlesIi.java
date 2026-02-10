// Last updated: 2/10/2026, 3:11:46 PM
class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int totalBottles = numBottles;
        int empty = numBottles;
        int rate = numExchange;
        while(empty >= rate){
            empty -= rate;
            totalBottles += 1;
            empty += 1;
            rate += 1;
        }
        return totalBottles;
    }
}