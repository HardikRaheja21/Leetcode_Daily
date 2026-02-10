// Last updated: 2/10/2026, 3:09:54 PM
class Solution {
    public String lexSmallest(String s) {
        int n = s.length();
        String result = s;
        for(int k = 1; k <= n; k++){
            String firstReversed = reverseSubString(s, 0, k - 1);
            if(firstReversed.compareTo(result) < 0){
                result = firstReversed;
            }
            String lastReversed = reverseSubString(s, n - k, n - 1);
            if(lastReversed.compareTo(result) < 0){
                result = lastReversed;
            }
        }
        return result;
    }
    public String reverseSubString(String s, int l, int r){
        char[] arr = s.toCharArray();
        while(l < r){
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return new String(arr);
    }
}