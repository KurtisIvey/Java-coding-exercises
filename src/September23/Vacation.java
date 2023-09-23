package September23;

public class Vacation {
    public static boolean setAlarm(boolean employed, boolean vacation) {
        // all other conditions are false, so only this one matters
        return employed && !vacation;
    }

}
