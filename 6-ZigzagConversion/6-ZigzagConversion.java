// Last updated: 2/10/2026, 3:20:41 PM
class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }

        // Create a StringBuilder array to hold the rows
        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++){
            rows[i] = new StringBuilder();
        }

        // Initialize variables
        int currentRow = 0;
        boolean goingDown = false;

        //Traverse the input string
        for(char c : s.toCharArray()){
            //Append the current character to the appropriate row
            rows[currentRow].append(c);

            //Change direction at the top or bottom row
            if(currentRow == 0 || currentRow == numRows - 1){
                goingDown = !goingDown;
            }

            //Move to the next row: either down or up
            currentRow += goingDown ? 1 : -1;
        }

        //Combine all rows to form the final output string
        StringBuilder result = new StringBuilder();
        for(StringBuilder row : rows) {
            result.append(row);
        }
        return result.toString();
    }
}