// Last updated: 2/10/2026, 3:16:30 PM
class Solution {
    //Function to check if a number is self-dividing
    public boolean selfDividing(int num){
        int originalNum = num;

        while(num > 0){
            int digit = num%10;
            // If the digit is zero or the original number is not divisible by the digit
            if(digit == 0 || originalNum % digit != 0){
                return false;
            }
            num /= 10; //Move to the next digit
        }
        return true;
    }

    //function to find all self-dividing numbers between left and right
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        for(int num = left; num <= right; num++){
            if(selfDividing(num)) {
                result.add(num);
            }
        }
        return result;
    }
}