// Last updated: 2/10/2026, 3:15:39 PM
class Solution {
    private int totalPaths = 0; // To keep track of valid paths
    private int emptyCells = 0; // Count of cells to visit (excluding obstacles)
    public int uniquePathsIII(int[][] grid) {
        int startX = 0, startY = 0;

        // Count empty cells and locate the start cell
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    emptyCells++;
                } else if (grid[i][j] == 1) {
                    startX = i;
                    startY = j;
                }
            }
        }

        // Start DFS traversal from the start cell
        dfs(grid, startX, startY, 0);
        return totalPaths;
    }

    private void dfs(int[][] grid, int x, int y, int visitedCells) {
        // Boundary check and avoid obstacles or already visited cells
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == -1) {
            return;
        }

        // If we've reached the end and visited all cells, count as valid path
        if (grid[x][y] == 2) {
            if (visitedCells == emptyCells + 1) { // +1 for start cell
                totalPaths++;
            }
            return;
        }

        // Mark this cell as visited
        int temp = grid[x][y];
        grid[x][y] = -1;

        // Explore all four possible directions
        dfs(grid, x + 1, y, visitedCells + 1); // Down
        dfs(grid, x - 1, y, visitedCells + 1); // Up
        dfs(grid, x, y + 1, visitedCells + 1); // Right
        dfs(grid, x, y - 1, visitedCells + 1); // Left

        // Reset this cell (backtrack) to allow for other paths
        grid[x][y] = temp;
    }
}