package September09;

public class SentenceSmash {
    public static String smash(String... words) {
        // array of words, create output stringbuilder and for loop each word to output
        StringBuilder output = new StringBuilder();
        for(String word: words) {
            output.append(" ").append(word);
        }
        return output.toString().trim();
    }
}
