// Last updated: 2/10/2026, 3:10:26 PM
class Solution {
    public int maxBalancedShipments(int[] weight) {
        int n = weight.length;
        int count = 0;
        int i = 0;

        while (i < n) {
            int max = weight[i];
            int j = i + 1;
            boolean found = false;

            while (j < n) {
                max = Math.max(max, weight[j]);
                if (weight[j] < max) {
                    // We found a balanced shipment [i...j]
                    count++;
                    i = j + 1; // move to next possible shipment
                    found = true;
                    break;
                }
                j++;
            }

            if (!found) {
                // No balanced shipment found starting at i
                break;
            }
        }

        return count;
    }
}
