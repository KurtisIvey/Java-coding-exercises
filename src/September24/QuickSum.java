package September24;

public class QuickSum {
    public int quicksum(String packet) {
        // Define a default string containing the uppercase letters of the alphabet
        final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // Initialize the total sum to 0
        int total = 0;

        // Loop through each character in the packet
        for (int i = 0; i < packet.length(); i++) {
            char letter = packet.charAt(i);

            // Check if the character is an uppercase letter
            if (Character.isUpperCase(letter)) {
                // Calculate the multiplier for the character based on its position in the alphabet
                int multiplier = ALPHABET.indexOf(letter) + 1;

                // Add the product of the multiplier and the position of the character in the packet to the total
                total += multiplier * (i + 1);
            } else if (letter == ' ') {
                // Spaces have a value of zero, so add 0 to the total
                total += 0;
            } else {
                // If a character is not an uppercase letter or space, return 0 as per the problem statement
                return 0;
            }
        }

        // Return the total Quicksum value of the packet
        return total;
    }

}
