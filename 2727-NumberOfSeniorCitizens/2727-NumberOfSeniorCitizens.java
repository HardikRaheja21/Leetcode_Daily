// Last updated: 2/10/2026, 3:12:25 PM
class Solution {
    public int countSeniors(String[] details) {
        int count = 0;

        for(String detail : details){
            // The Integer.parseInt method in Java is used to convert a string to an integer. 
            int age = Integer.parseInt(detail.substring(11, 13));
            if(age > 60){
                count++;
            }
        }
        return count;
    }
}