// Last updated: 2/10/2026, 3:14:34 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalBottles = numBottles;
        int empty = numBottles;
        while(empty >= numExchange){
            int newDrinkableBottles = empty / numExchange;
            totalBottles += newDrinkableBottles;
            empty = empty % numExchange + newDrinkableBottles;
        }
        return totalBottles;
    }
}