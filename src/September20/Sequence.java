package September20;

public class Sequence {

    public static int[] reverse(int n){
        // defines the set size by n
        int[] result = new int[n];
        // adds decrementing n until it reaches 1
        for (int i = n; i >= 1; i--) {
            // works backwards
            result[n - i] = i;
        }

        return result;
    }

}
