package September23;

public class DutyFreeWhiskey {
    public static int dutyFree(int normPrice, int discount, int hol) {
        // Calculate the amount saved per bottle
        // double handles fractional numbers better, using int could lose precision of fraction part lead to errors
        double savedPerBottle = (double) normPrice * (double) discount / 100.0;

        // Calculate the number of bottles needed to cover the holiday cost
        // recast to int to round down to nearest whole number
        int numberOfBottles = (int) (hol / savedPerBottle);

        return numberOfBottles;
    }
}
