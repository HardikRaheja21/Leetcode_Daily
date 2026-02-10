// Last updated: 2/10/2026, 3:15:55 PM
class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] pse = getPSE(arr);
        int[] nge = getNSE(arr);
        long ans = 0;
        int MOD = 1_000_000_007;

        for(int i = 0; i < n; i++){
            long left = i - pse[i];
            long right = nge[i] - i;
            long contribution = (left * right) % MOD;
            contribution = (contribution * arr[i]) % MOD;

            ans = (ans + contribution) % MOD; 
        }
        return (int) ans;
    }
    private int[] getPSE(int[] arr) {
        int n = arr.length;
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        return pse;
    }

    private int[] getNSE(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        return nse;
    }
}