package September07;

public class ConvertMpgToKpl {
    public static float mpgToKPM(final float mpg) {
        final double miles_to_kilometers = 1.609344;
        final double gallons_to_liters = 4.54609188;

        double kpl = (mpg * miles_to_kilometers) / gallons_to_liters;
        return (float) (Math.round(kpl * 100.00) / 100.00);
    }
}

