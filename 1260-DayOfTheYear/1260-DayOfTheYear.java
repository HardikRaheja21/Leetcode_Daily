// Last updated: 2/10/2026, 3:15:17 PM
import java.time.LocalDate;
class Solution {
    public int dayOfYear(String date) {
        // Parse the date string to a LocalDate object
        LocalDate localDate = LocalDate.parse(date);
        
        // Use the getDayOfYear method to get the day of the year
        return localDate.getDayOfYear();
    }
}