// Last updated: 2/10/2026, 3:11:02 PM
import java.util.*;

public class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        Map<Integer, List<Integer>> rows = new HashMap<>(); // x -> list of y
        Map<Integer, List<Integer>> cols = new HashMap<>(); // y -> list of x

        for (int[] b : buildings) {
            int x = b[0], y = b[1];
            rows.computeIfAbsent(x, k -> new ArrayList<>()).add(y);
            cols.computeIfAbsent(y, k -> new ArrayList<>()).add(x);
        }

        // sort the lists for each row and column
        for (List<Integer> ys : rows.values()) Collections.sort(ys);
        for (List<Integer> xs : cols.values()) Collections.sort(xs);

        int covered = 0;
        for (int[] b : buildings) {
            int x = b[0], y = b[1];
            List<Integer> ys = rows.get(x);
            List<Integer> xs = cols.get(y);

            // need at least 3 in row and 3 in column to have both sides
            if (ys.size() < 3 || xs.size() < 3) continue;

            if (ys.get(0) < y && y < ys.get(ys.size() - 1) &&
                xs.get(0) < x && x < xs.get(xs.size() - 1)) {
                covered++;
            }
        }
        return covered;
    }
}
