// Last updated: 2/10/2026, 3:15:14 PM
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
class Solution {
    public int daysBetweenDates(String date1, String date2) {
        // Parse the date strings to LocalDate objects
        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);
        
        // Calculate the absolute difference in days
        return (int) Math.abs(ChronoUnit.DAYS.between(d1, d2));
    }
}