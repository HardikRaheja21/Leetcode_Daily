// Last updated: 2/10/2026, 3:14:38 PM
class Solution {
    public int minNumberOperations(int[] target) {
        int operations = target[0];
        for(int i = 1; i < target.length; i++){
            if(target[i] > target[i - 1]) {
                operations += target[i] - target[i - 1];
            }
        }
        return operations;
    }
}