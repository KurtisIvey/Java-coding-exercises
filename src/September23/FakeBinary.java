package September23;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < numberString.length();i++) {
            // receives unicode, so this wont work
            //int intValue = numberString.charAt(i);
            // we must first define char
            char digitChar = numberString.charAt(i);
            // then using getNumericValue method off of Character to get the actual num value
            int digitValue = Character.getNumericValue(digitChar);
            if (digitValue < 5) {
                output.append("0");
            } else {
                output.append("1");
            }
        }
        return output.toString();
    }
}
