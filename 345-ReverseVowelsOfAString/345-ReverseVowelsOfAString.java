// Last updated: 2/10/2026, 3:17:29 PM
class Solution {
    public String reverseVowels(String s) {
        // Define a set of vowels for quick lookup
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        // Convert the string to a character array to allow swapping\
        char[] arr = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            // Move left pointer until we find a vowel
            while (left < right && !vowels.contains(arr[left])) {
                left++;
            }
            
            // Move right pointer until we find a vowel
            while (left < right && !vowels.contains(arr[right])) {
                right--;
            }

            //Swap the vowels
            if(left < right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        return new String(arr);
    }
}