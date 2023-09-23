package September21;

public class LongestVowelSubstring {
    public static int longestVowelSubstring(String s) {
        int maxLength = 0;
        int currentLength = 0;

        // Define a set of vowels
        String vowels = "aeiou";
        // s.toCharArray turns into array of characters such as hello > ['h','e','l','l','o']
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) >= 0) {
                // If the character is a vowel, increment the current length
                currentLength++;
            } else {
                // If the character is not a vowel, reset the current length
                currentLength = 0;
            }
            // Update the maxLength if the current length is greater
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        return maxLength;
    }
}

