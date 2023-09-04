package September04;

public class Delimiters {
    public static String printArray(Object[] array) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i<array.length;i++) {
            result.append(array[i]);
            if(i < array.length - 1) {
                result.append(",");
            }
        }
        String output = result.toString();
        return output;
    }
}
