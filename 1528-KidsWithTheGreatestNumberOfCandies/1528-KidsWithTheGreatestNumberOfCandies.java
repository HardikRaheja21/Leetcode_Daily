// Last updated: 2/10/2026, 3:14:50 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxcandies = 0;

        for(int i = 0; i < candies.length; i++){
            if(candies[i] > maxcandies){
                maxcandies = candies[i];
            }
        }

        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= maxcandies){
                result.add(true);
                // temp = candies[i] + extraCandies;
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}