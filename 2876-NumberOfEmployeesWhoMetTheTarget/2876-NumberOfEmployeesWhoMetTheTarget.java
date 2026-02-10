// Last updated: 2/10/2026, 3:12:13 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int i = 0; i < hours.length; i++){
            if(hours[i] >= target){
                count++;
            }
        }
        return count;
    }
}