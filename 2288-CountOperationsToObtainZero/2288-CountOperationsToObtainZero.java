// Last updated: 2/10/2026, 3:13:27 PM
class Solution {
    public int countOperations(int num1, int num2) {
        int count = 0;
        while(num1 != 0 &&
         num2 != 0){
            if(num1 >= num2) num1 -= num2;
            else num2 -= num1;
            count++;
        }
        return count;
    }
}