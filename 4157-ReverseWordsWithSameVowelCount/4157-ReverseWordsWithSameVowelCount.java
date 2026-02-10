// Last updated: 2/10/2026, 3:09:39 PM
class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        String[] words = s.split(" ");
        int vowels = countVowel(words[0]);
        for(int i = 1; i < words.length; i++){
            int vowel = countVowel(words[i]);
            if(vowel == vowels){
                words[i] = reverseWord(words[i]);
            }
        }
        String result = String.join(" ", words);
        return result;
    }
    public int countVowel(String str){
        int vowelCount = 0;
        for(char ch : str.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vowelCount++;
        }
        return vowelCount;
    }
    public String reverseWord(String str){
        String res = "";
        for(int i = str.length() - 1; i >= 0; i--){
            res += str.charAt(i);
        }
        return res;
    }
}