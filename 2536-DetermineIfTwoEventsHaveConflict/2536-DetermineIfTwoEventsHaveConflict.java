// Last updated: 2/10/2026, 3:12:54 PM
class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        // Check if the end time of event1 is after or at the start time of event2
        // and if the end time of event2 is after or at the start time of event1
        return event1[1].compareTo(event2[0]) >= 0 && event2[1].compareTo(event1[0]) >= 0;
    }
}