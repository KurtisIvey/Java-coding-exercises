package September05;

public class DoubleChar {
    public static String doubleChar(String s){
        //enter your code here
        StringBuilder output = new StringBuilder();
        for(int i = 0; i< s.length();i++) { // iterate through w/ for loop
            output.append(doubleIt(s.charAt(i))); // add doubled char to output stringbuilder
        }
        return output.toString();
    }
    // returns String type, so set as String
    public static String doubleIt(char c) {
        return String.valueOf(c) + c; // converts char to string and doubles it
    }
}
