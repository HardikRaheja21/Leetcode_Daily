// Last updated: 2/10/2026, 3:13:07 PM
import java.util.*;

class Solution {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {

        // 1. Sort buses and passengers
        Arrays.sort(buses);
        Arrays.sort(passengers);

        // Store passenger arrival times for collision check
        Set<Integer> passengerTimes = new HashSet<>();
        for (int p : passengers) passengerTimes.add(p);

        int i = 0; // passenger pointer
        int n = passengers.length;

        // 2. Simulate boarding bus by bus
        for (int b = 0; b < buses.length; b++) {
            int bus = buses[b];
            int boarded = 0;

            // Board passengers for this bus
            while (i < n && passengers[i] <= bus && boarded < capacity) {
                i++;
                boarded++;
            }

            // 3. Only the LAST bus decides the answer
            if (b == buses.length - 1) {

                // Case 1: last bus NOT full
                if (boarded < capacity) {
                    int candidate = bus;

                    // Avoid passenger arrival collisions
                    while (passengerTimes.contains(candidate)) {
                        candidate--;
                    }
                    return candidate;
                }

                // Case 2: last bus IS full
                int candidate = passengers[i - 1] - 1;

                while (passengerTimes.contains(candidate)) {
                    candidate--;
                }
                return candidate;
            }
        }

        return -1; // unreachable
    }
}
