// Last updated: 2/10/2026, 3:16:12 PM
class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder sb = new StringBuilder();
        String suffix = "";
        Character[] vowelsarr = {'a', 'e','i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        Set<Character> vowels = new HashSet<>(Arrays.asList(vowelsarr));

        for(String word: sentence.split(" ")){
            suffix += 'a';
            if(!vowels.contains(word.charAt(0))){
                word = word.substring(1) + word.charAt(0);
            }
            sb.append(word).append("ma").append(suffix).append(' ');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}