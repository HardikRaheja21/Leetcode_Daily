// Last updated: 2/10/2026, 3:13:39 PM
class Solution {
    public int nextBeautifulNumber(int n) {
        int beautifulNumber = n + 1;
        while(!isBalanced(beautifulNumber)){
            beautifulNumber++;
        }
        return beautifulNumber;
    }
    public boolean isBalanced(int num){
        int[] count = new int[10];
        int temp = num;
        while(temp > 0){
            int digit = temp % 10;
            count[digit]++;
            temp /= 10;
        }
        if(count[0] > 0) return false;
        for(int i = 0; i < 10; i++){
            if(count[i] > 0 && count[i] != i){
                return false;
            }
        }
        return true;
    }
}