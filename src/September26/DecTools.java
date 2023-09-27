package September26;

public class DecTools {
    public static int Digits(long n) {
        // convert long to string via .toString method
        String numStr = Long.toString(n);
        // return via .length() since it is a string
        return numStr.length();
    }
}
