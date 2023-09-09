package September09;

public class NeedleInHaystack {
    public static String findNeedle(Object[] haystack) {
        // Object[] means array
        final String targetWord = "needle";
        for (int i = 0; i < haystack.length;i++){
            if (haystack[i] instanceof String) {
                // If it's a String, cast it to String and compare it to the targetWord
                if (((String) haystack[i]).equals(targetWord)) {
                    // If it matches the targetWord, return the position where it was found
                    return "found the needle at position " + i;
                }
            }
        }
        return "not found";
    }
}

/*
Faster way converting array to list

public static String findNeedle(Object[] haystack) {
    // Convert the haystack array to a List and find the index of "needle"
    int indexOfNeedle = java.util.Arrays.asList(haystack).indexOf("needle");

    // Use String.format to create a formatted string result
    return String.format("found the needle at position %d", indexOfNeedle);
}
 */