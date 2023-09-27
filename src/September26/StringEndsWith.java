package September26;

public class StringEndsWith {
    public static boolean solution(String str, String ending) {
        // p full string, and ending of string that it should be a part of
        // return boolean
        /*
            should be able to use a substring to calc where ending would be in a new string
            then compare with ending to ensure it is .equals to
         */
        if (ending.length() > str.length()) {
            return false;
        }
        // extracts the substring starting at the beginning of what the ending should be
        String strEnding = str.substring(str.length() - ending.length());
        return strEnding.equals(ending);
    }
}

/*
  the only real solution that matters....built in one liner lol

 public static boolean solution(String str, String ending) {
    return str.endsWith(ending);
  }
 */