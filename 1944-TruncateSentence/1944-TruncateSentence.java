// Last updated: 2/10/2026, 3:14:01 PM
class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        return String.join(" ", java.util.Arrays.copyOfRange(words, 0, k));
    }
}







// Split the Sentence: s.split(" ") splits the sentence s into an array of words.
// Copy the First k Words: Arrays.copyOfRange(words, 0, k) returns a new array containing the first k words.
// Join Words into a String: String.join(" ", ...) joins the words with a single space.