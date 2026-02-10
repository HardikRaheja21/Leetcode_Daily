// Last updated: 2/10/2026, 3:10:16 PM
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOfOdd = 0;
        int count = 0;
        int num = 0;
        while(count < n){
            if(num % 2 != 0){
                sumOfOdd += num;
                count++;
            }
            num++;
        }
        count = 0;
        num = 0;
        int sumOfEven = 0;
        while(count < n){
            if(num % 2 == 0){
                sumOfEven += num;
                count++;
            }
            num++;
        }
        return gcd(sumOfOdd, sumOfEven);
    }
    public int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}