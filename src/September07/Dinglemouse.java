package September07;

public class Dinglemouse {
    public static String replaceDots(final String str) {
        // previously: return str.replaceAll(".", "-");
        // replaceAll takes regex as first arg in java
        return str.replaceAll("\\.", "-");
    }

}