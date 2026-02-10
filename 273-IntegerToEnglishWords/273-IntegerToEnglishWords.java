// Last updated: 2/10/2026, 3:17:45 PM
class Solution {
    String[] below_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    String[] units = {"", "Thousand", "Million", "Billion"};
    public String numberToWords(int num) {
        if(num == 0) return "Zero";
        int i = 0;
        String words = "";
        while(num > 0){
            int chunck = num % 1000;
            if(chunck != 0){
                words = helper(chunck).trim() + " " + units[i] + " " + words;
            }
            num /= 1000;
            i++;
        }
        return words.trim();
    }
    public String helper(int num){
        if(num == 0) return "";
        else if(num < 20) return below_20[num] + " ";
        else if(num < 100) return tens[num / 10] + " " + helper(num % 10);
        else return below_20[num / 100] + " Hundred " + helper(num % 100);
    }
}