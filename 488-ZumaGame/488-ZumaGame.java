// Last updated: 2/10/2026, 3:16:59 PM
import java.util.*;

public class Solution {
    // Memoization to store state strings "board + # + hand"
    Map<String, Integer> memo = new HashMap<>();
    int MAX_STEPS = 6; // Max hand size is 5, so 6 is effectively infinity

    public int findMinStep(String board, String hand) {
        int[] handCount = new int[26];
        for (char c : hand.toCharArray()) handCount[c - 'A']++;
        memo.clear();
        int res = dfs(board, handCount);
        return res == MAX_STEPS ? -1 : res;
    }

    private int dfs(String board, int[] handCount) {
        if (board.isEmpty()) return 0;
        
        // Memoization Key: Board state + Hand count
        // Arrays.toString is necessary to uniquely identify the hand state
        String key = board + "#" + Arrays.toString(handCount);
        if (memo.containsKey(key)) return memo.get(key);

        int minSteps = MAX_STEPS;

        for (int i = 0; i < board.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if (handCount[j] <= 0) continue;
                
                char ball = (char)('A' + j);
                boolean worthTrying = false;

                // STRATEGY 1: Standard Greedy
                // Insert 'X' into a group of 'X's. 
                // Optimization: Only insert at the start of the group to avoid duplicates.
                if (board.charAt(i) == ball) {
                    if (i == 0 || board.charAt(i - 1) != ball) {
                        worthTrying = true;
                    }
                } 
                
                // STRATEGY 2: The "Split" Fix (Crucial for "RRWWRRBBRR")
                // Insert 'Y' between 'XX' to split them.
                // This prevents premature merging or bridges groups.
                // We verify we are inside a pair (board[i] == board[i-1]) and the ball is different.
                else if (i > 0 && board.charAt(i) == board.charAt(i - 1) && board.charAt(i) != ball) {
                    worthTrying = true;
                }

                if (worthTrying) {
                    StringBuilder nextBoard = new StringBuilder(board);
                    nextBoard.insert(i, ball);
                    
                    // Update Board (Chain Reaction)
                    String processedBoard = resolveBoard(nextBoard.toString());

                    // Recursive Call
                    handCount[j]--;
                    int steps = dfs(processedBoard, handCount);
                    handCount[j]++; // Backtrack

                    if (steps != MAX_STEPS) {
                        minSteps = Math.min(minSteps, steps + 1);
                    }
                }
            }
        }

        memo.put(key, minSteps);
        return minSteps;
    }

    // Standard Zuma simulation logic
    private String resolveBoard(String board) {
        int i = 0;
        while (i < board.length()) {
            int j = i;
            while (j < board.length() && board.charAt(j) == board.charAt(i)) {
                j++;
            }
            if (j - i >= 3) {
                board = board.substring(0, i) + board.substring(j);
                i = 0; // Restart check from beginning (safest approach)
            } else {
                i++;
            }
        }
        return board;
    }
}