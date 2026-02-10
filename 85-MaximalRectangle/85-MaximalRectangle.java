// Last updated: 2/10/2026, 3:19:27 PM
class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix[0].length, m = matrix.length;
        int[][] prefixSum = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if (matrix[i][j] == '1') {
                    prefixSum[i][j] = (i == 0 ? 1 : prefixSum[i - 1][j] + 1);
                } else {
                    prefixSum[i][j] = 0;
                }
            }
        }
        int maxArea = 0;
        for(int i = 0; i < m; i++){
            maxArea = Math.max(maxArea, largestRectangleArea(prefixSum[i]));
        }
        return maxArea;
    }
     public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        for(int i = 0; i < heights.length; i++){
            while(!st.isEmpty() && heights[st.peek()] > heights[i]){
                int element = st.pop();
                int nse = i;
                int pse = st.isEmpty() ? -1 : st.peek();
                maxArea = Math.max(maxArea, heights[element] * (nse - pse - 1));
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int nse = heights.length;
            int element = st.pop();
            int pse = st.isEmpty() ? -1 : st.peek();
            maxArea = Math.max(maxArea, heights[element] * (nse - pse - 1));
        }
        return maxArea;
    }
}